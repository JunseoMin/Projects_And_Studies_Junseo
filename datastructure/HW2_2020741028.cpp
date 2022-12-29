//visualstudio 2019, windows10
#include <iostream>
#include <stack>
#include <cstring>
#include <cctype>

using namespace std;
void clear(stack<double> numbers, stack<char> operations, istream& ins);
//1. clear istream 

double read_and_evaluate(istream& ins);
//1. input by cin function
//2. cheak parenthese
//3. return evaluated double

void evaluate(stack<double>& numbers,stack<char>& operations);
// throw error
// evaluate by stacks

int main()
{
	// input onr line- by- oneline
	// Continue the program until the EOI is entered
	// Only non-negative double can be entered
	// 3 types of brackets ({[ can be used
	// can use 4 binary operators => Priority operation exists
	// all of real numbers can be output value
	// Exception output when exception is found (divided by 0, parenthesis count or shape different)
	// It is assumed that no input is received except for double positive number and operator
	double res;
	
	while (1) {
		try {
			res = read_and_evaluate(cin);
			cout << fixed;
			cout.precision(3);
			cout << res << endl;
		}
		catch (double except) {
			cout << "Error!: divided by zero" << endl;
		}
		catch (char expt) {
			cout << "Error!: unbalanced parentheses " << endl;
		}
		cin.ignore();
	}
}

void clear(stack<double> numbers,stack<char> operations,istream& ins) {
	while (!numbers.empty())numbers.pop();
	while (!operations.empty())operations.pop();
	while (ins.peek() != '\n')ins.ignore();
}

void evaluate(stack<double>& numbers, stack<char>& operations) {
	double operand1; double operand2;
	operand2 = numbers.top();
	numbers.pop();
	operand1 = numbers.top();
	numbers.pop();
	switch (operations.top()) {
	case '+':numbers.push(operand1 + operand2); break;
	case '-':numbers.push(operand1 - operand2); break;
	case '*':numbers.push(operand1 * operand2); break;
	case '/':
		if (operand2 == 0) throw operand2;
		numbers.push(operand1 / operand2); break;
	}
	operations.pop();
}

double read_and_evaluate(istream& ins) {
	stack<char> operations;
	stack<double> numbers;

	double res;
	double number;
	char symbol;
	char parenthes;
	char err='e';

	while (ins && ins.peek() != '\n')
	{//push infix to stack
		if (isdigit(ins.peek()) || ins.peek() == '.') {			//if is number
			ins >> number;
			numbers.push(number);
		}
		else if (strchr("+-*/", ins.peek()) != NULL) {			//if is operations 
			ins >> symbol;		
			if (operations.empty()==true) {						//if operations stack is empty
				operations.push(symbol);
			}
			else {
				switch (symbol)
				{												//Consider operators with the same priority
				case'*':case'/':								
					operations.push(symbol);
					break;
				case'+':case'-':
					if ((operations.top() == '*') || (operations.top() == '/')) {
						evaluate(numbers, operations);
						operations.push(symbol);
						break;
					}
					else operations.push(symbol);
				}
			}
		}
		else if (ins.peek() == ')') {						//Calculate every time parentheses appear				
			ins.ignore();									//Ignore right parentheses and calculate until left parentheses appear
			if (operations.empty())(throw err);
			while (operations.top() != '(') {
				if (strchr("{[", operations.top()) != NULL) {// Error output if parentheses are incorrect
					clear(numbers, operations, ins);		 // clear
					throw err;								 //err throw -> exit function
				}
				evaluate(numbers, operations);
				if (operations.empty()) {
					clear(numbers, operations, ins);
					throw err;
				}			//If only right parentheses are entered
			}
			operations.pop();
		}
		else if (ins.peek() == '}') {
			ins.ignore();
			if (operations.empty())throw err;
			while (operations.top() != '{') {
				if (strchr("([", operations.top()) != NULL) {
					clear(numbers, operations, ins);
					throw err;
				}
				evaluate(numbers, operations);
				if (operations.empty()) {
					clear(numbers, operations, ins);
					throw err;
				}
			}
			operations.pop();
		}
		else if (ins.peek() == ']') {
			ins.ignore();
			if (operations.empty())(throw err);
			while (operations.top() != '[') {
				if (strchr("({", operations.top()) != NULL) {
					clear(numbers, operations, ins);
					throw err;
				}
				evaluate(numbers, operations);
				if (operations.empty()) {
					clear(numbers, operations, ins);
					throw err;
				}
			}
			operations.pop();
		}
		else if (strchr("({[", ins.peek()) != NULL) {		// If left parentheses
			ins >> parenthes;
			operations.push(parenthes);
		}
		else if (ins.peek() == 'E') {
			ins.ignore();
			if (ins.peek() == 'O') {
				ins.ignore();
				if (ins.peek() == 'I') {	//Exit the program when the EOI is entered
					exit(true);
				}
			}
		}
		else ins.ignore();				
	}
	while (!operations.empty()) {			//Processing the remaining calculations
		switch (operations.top()) {
		case '(':case '{':case '[':
			clear(numbers, operations, ins);
			throw err;
		default:
			evaluate(numbers, operations); break;
		}
	}
	return numbers.top();
}
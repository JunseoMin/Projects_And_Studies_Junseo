#include <iostream>
#include "MyDoubleVector.h"

using namespace std;

double& destructorT(void);

int main(void) {
	MyDoubleVector v1(2);
	MyDoubleVector v2(3);
	MyDoubleVector v3(3);
	v1.push_back(1.0);
	v1.push_back(2.0);
	v1.push_back(3.0);					// reserve function test
	//cout << v1.capacity() << endl;	// pushback function, reserve function
	for (int i = 0; i < 3; i++) {
		double num = v1[i];
		cout << num;
	}
	cout << endl;
	v2(3.0);						// ()operator
	for (int i = 0; i < 3; i++)		// ()operatr cheak
	{
		double num = v2[i];
		cout << num;	
	}
	cout << endl;
	
	v3 = v1 + v2;					//+operator cheak
	for (int i = 0; i < 3; i++)		
	{
		double num = v3[i];
		cout << num;
	}
	cout << endl;
	v3 = v1 - v2;
	for (int i = 0; i < 3; i++)		//-operator cheak
	{
		double num = v3[i];
		cout << num;
	}
	cout << endl;
	cout << v1 * v2 << endl;		//*operator cheak
	cout << (v1 == v2) << endl;		//==operator cheak
	MyDoubleVector v4=-(v3);
	for (int i = 0; i < 3; i++)		//-()operator cheak
	{
		double num = v4[i];
		cout << num;
	}
	cout << endl;

	v3 += v1;
	for (int i = 0; i <6; i++)		//+=operator cheak
	{
		double num = v3[i];
		cout << num;
	}

	v3 = v1;
	for (int i = 0; i < 3; i++)		//=operator cheak
	{
		double num = v3[i];
		cout << num;
	}

	//member function test
	cout << v1.capacity() <<endl;
	v1.pop_back();
	cout << v1.size() << endl;
	cout << v1.empty() << endl;
	v1.clear();
	cout << v1.empty();

	// if destructor acts well, this code will make err.
	// size_t num=destructorT(); 

	return 0;
}

double& destructorT() {
	MyDoubleVector d;
	d.push_back(1.0);

	return d[1];
}
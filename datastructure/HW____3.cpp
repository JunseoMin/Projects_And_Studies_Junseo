//2020741028 민준서
//visualstudio 2019
#include <iostream>
#include <vector>
#include <algorithm>
#include <format>
#include <cmath>

#define U 0
#define D 1
#define R 2
#define L 3

using namespace std;

int center(int n) { return n <= 1 ? 0 : 2 * center(n / 4) + 1; }
int depth(int n) { return n <= 7 ? 1 : 2 * depth(n / 4); }

void make_vec(istream& ins, vector<char>& invec);
void rotated(const vector<char>& invec,int i,int depth);
void not_rotated(const vector<char>& invec, int depth);
void Del_Heap(vector<char>& invec,const char target);
char** H(char** H_tree, const vector<char>& invec, int node_index, int i, int j, int d, int up, int down, int right, int left);
void h_tree(char**& H_tree, const vector<char>& invec, int size);
char** H_size(int size);

int main()
{
	vector<char> invec;

	while (1)
	{
		try
		{
			make_vec(cin,invec);											//get vector and make B-tree
		}
		catch (bool)
		{
			cout << "!!ERROR:: USE INS # OR EOI";
		}
		catch (int) {
			cout << "!!ERROR:: NONE DEL";
		}
		cin.ignore();
	}
}

void make_vec(istream& ins, vector<char>& invec) {
	char inchar;
	int full_depth=1;
	int tree_size=0;
	int h_3_size=1;
	while (ins && ins.peek() != '\n') {
		if (ins.peek() == 'E') {
			ins.ignore();
			if (ins.peek() == 'O') {
				ins.ignore();
				if (ins.peek() == 'I') {	
					make_heap(invec.begin(), invec.end());
					for (int i = 1; i < invec.size(); i++)			//full depth of tree
						if (i == pow(2, full_depth) - 1) {
							++full_depth;
						}
					--full_depth;
					cout << "1. Rotated form  "<<endl;
					rotated(invec,0,0);
					cout << "2. Not-Rotated form "<<endl;
					not_rotated(invec,full_depth);
					cout << "3. H-tree form "<<endl;
					for (int k = 1; k < depth(invec.size()); k++)
						if (k == pow(2, h_3_size) - 1) {
							++h_3_size;
						}
					tree_size = pow(2, h_3_size + 1) - 1;
					char** H_tree = H_size(tree_size);
					h_tree(H_tree, invec, tree_size);
					break;
				}
			}
		}
		else if (ins.peek() == 'I') {
			ins.ignore();
			if (ins.peek() == 'N') {
				ins.ignore();
				if (ins.peek() == 'S') {
					{
						ins.ignore();
						ins >> inchar;
						invec.push_back(inchar);
						if (invec.size() == 200) {
							exit(true);
						}
					}
				}
			}
		}
		else if (ins.peek() == 'E') {	// 실수로 선택 노드 지우는 함수 만들었는데 아쉬워서 납뒀습니다...
			ins.ignore();
			if (ins.peek() == 'R') {
				ins.ignore();
				if (ins.peek() == 'S') {
					ins.ignore();
					ins >> inchar;
					Del_Heap(invec, inchar);
				}
			}
		}
		else if (ins.peek() == 'D') {	
			ins.ignore();
			if (ins.peek() == 'E') {
				ins.ignore();
				if (ins.peek() == 'L') {
					ins.ignore();
					make_heap(invec.begin(), invec.end());
					pop_heap(invec.begin(), invec.end());
					invec.pop_back();
				}
			}
		}
		else if(ins.peek()==' ')
		{
			ins.ignore();
		}
		else {
					throw false;
		}
	}
}
void rotated(const vector<char>& invec,const int i ,const int depth) {
	//Reculsive Function
	//Right child=index*2+2
	//left child = index*2+1
	if (i<invec.size()) {
		rotated(invec, 2 * i + 1, depth + 1);
		cout.width(depth*2);
		cout << invec[i] << endl;
		rotated(invec, 2 * i + 2, depth + 1);
	}
}
void not_rotated(const vector<char>& invec, int full_depth) {
	int i=0;
	int k = 0;		//k=depth
	int fd = full_depth;
	while (true)
	{
		i = k;
		for (int l = 0; l < i + 1; l++) {
			if (k == invec.size()) {
				cout << endl;
				return;
			}
			if ((i + l) % 2 != 0)cout.width(pow(2, full_depth));
			else if ((i + l) == 0)cout.width(pow(2,full_depth)-1);
			else cout.width(pow(2, full_depth) + 1);
			cout  << invec[i + l];
			k++;
		}
		cout << endl;
		full_depth--;
	}
}

char** H_size(int size) {
	char** arr = new char* [size];
	for (int i = 0; i < size; ++i) {
		arr[i] = new char[size];
		memset(arr[i], 0, sizeof(char) * size);
	}
	return arr;
}

char** H(char** H_tree,const vector<char>& invec, int node_index, int i, int j, int d, int up, int down, int ight, int left) {
	int V[4][2] = { { -1, 0 },{ 1, 0 },{ 0, 1 },{ 0, -1 } };
	if (node_index > invec.size()) return NULL;
	H_tree[i][j] = invec[node_index - 1];
	if (2 * node_index <= invec.size()) {
		H_tree[i + d * V[L][0]][j + d * V[L][1]] = invec[2 * node_index - 1];
		H(H_tree, invec, 4 * node_index, i + d * (V[L][0] + V[U][0]),
			j + d * (V[L][1] + V[U][1]), d / 2, D, U, L, R);
		H(H_tree, invec, 4 * node_index + 1, i + d * (V[L][0] + V[D][0]),
			j + d * (V[L][1] + V[D][1]), d / 2, U, D, R, L);
	}
	if (2 * node_index + 1 <= invec.size()) {
		H_tree[i + d * V[R][0]][j + d * V[R][1]] = invec[2 * node_index];
		H(H_tree, invec, 4 * node_index + 2, i + d * (V[R][0] + V[D][0]),
			j + d * (V[R][1] + V[D][1]), d / 2, U, D, R, L);
		H(H_tree, invec, 4 * node_index + 3, i + d * (V[R][0] + V[U][0]),
			j + d * (V[R][1] + V[U][1]), d / 2, D, U, L, R);
	}
	return H_tree;
}

void h_tree(char**& H_tree,const vector<char>& invec, int size) {
	char** htree = H(H_tree, invec, 1, center(invec.size()), center(invec.size()), depth(invec.size()), 0, 1, 2, 3);
	for (int i = 0; i < size; ++i) {
		for (int j = 0; j < size; ++j) {
			if (j == 0)
				cout.width(1);
			else
				cout.width(2);
			cout << htree[i][j];
		}
		cout << endl;
	}
	for (int i = 0; i < size; ++i) { delete[] htree[i]; } delete[] htree;
}

void Del_Heap(vector<char>& invec, const char target) {
	int i = 0;
	while (i<=invec.size()) {
		if (invec[i] == target) {
			invec.erase(invec.begin()+i);
			make_heap(invec.begin(), invec.end());
			return;
		}
		i++;
	}
	if (i == invec.size()) {
		throw i;
	}
}
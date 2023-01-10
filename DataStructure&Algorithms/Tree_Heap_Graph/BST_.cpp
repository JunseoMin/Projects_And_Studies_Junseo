//visual 2019
//BinarySearchTree
#include <iostream>

using namespace std;

struct node
{
	int data;
	node* left;
	node* right;
};

struct BST {
	node* root = nullptr;

	node* find(int value) {
		return find_impl(root, value);
	}

	void insert(int value) {
		if (!root) {
			root = new node{ value,NULL,NULL };
		}
		else insert_impl(root,  value);
	}

	void inorder() {
		inorder_impl(root);
	}

	node* successor(node* start) {
		auto current = start->right;
		while (current&&current->left)	// 왼쪽 자식이 없으면 return문으로
		{
			current = current->left;
		}
		return current;
	}// 후속node찿는 함수

	void delete_value(int value) {
		root = delete_value_impl(root, value);
	}

private:
	node* find_impl(node* root, int value) {
		if (!root) return;
		if (root->data == value) {
			cout << value << "를 찿았습니다";
			return root;
		}

		if (value >= root->data) {
			find_impl(root->right,value);
		}
		find_impl(root->left, value);

		// 교재에는 재귀호출 할 때 return하는데 왜함?
	}

	void insert_impl(node* root, int value) {
		if (value < root->data) {
			if (!root->left)
				root->left = new node{ value,NULL,NULL };
			else insert_impl(root->left, value);//작으면 왼쪽
		}
		else {
			if (!root->right)
				root->right = new node{ value,NULL,NULL };
			else insert_impl(root->right,value);//크면 오른쪽
		}
	}

	void inorder_impl(node* root) {
		if (!root) return;
		inorder_impl(root->left);
		cout << root->data<<" ";
		inorder_impl(root->right);
	}

	node* delete_value_impl(node* root,int value) {
		if (!root) return NULL;
		if (value < root->data) {
			root->left = delete_value_impl(root->left, value);
		}
		else if (value > root->data) {
			root->right = delete_value_impl(root->right, value);
		}
		else
		{
			if (!root->left) {
				auto tmp = root->right;
				delete root;
				return tmp;
			}//왼쪽 노드가 없는경우: 상위노드의 왼쪽노드가 하위노드의 오른쪽 노드가 됨 
			
			if (!root->right) {
				auto tmp = root->left;
				delete root;
				return tmp;
			}//오른쪽 노드가 없는경우: 상위노드의 오른쪽 노드가 하위노드의 왼쪽 노드가 됨

			auto succnode = successor(root);
			root->data = succnode->data;
			root->right = delete_value_impl(root->right, succnode->data);//우측 node에서 후속노드 찿아 수정하는 작업 재귀호출
		}
		return root;
	}
};
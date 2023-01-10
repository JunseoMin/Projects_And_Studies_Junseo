#include <iostream>
#include <queue>

using namespace std;

struct node
{
	string position;
	node* first;
	node* second;
};

struct org_tree {
	node* root;

	static org_tree creat_org_tree(const string& pos) {
		org_tree tree;
		tree.root = new node{ pos, NULL, NULL };
		return tree;
	}

	static node* find(node* root, string& pos) {
		if (root->position == pos) return root;
		if (root == NULL) return NULL;
		if (find(root->first, pos) == NULL) {
			find(root->second, pos);
		}
	}// 교재와 다른 방식으로 코딩함. 교재는 auto firstFound 선언해서 했는데 이게 더 효율적이지 않을가 싶었음

	//여기서부터 교재 이해안됨: auto로 상위노드 선언하고 finde로 찿아야하는데 find 함수의 인자가 node* 이 있어야하는데 finde함수는 
	//position만으로 node를 반환해야되는거 아닌가..? default값일때 진행하는 구간이 없음. auto managernode가 이해안됨
	static bool addSubordinate(const string& manager, const string& subordinate) {
		auto managernode = find(root, manager);

		if (!managernode) {
			cout << "존재하지 않음"<<endl;
			return false;
		}
		if (managernode->first && managernode->second) {
			cout << "추가할 수 없음" << endl;
			return false;
		}
		if (!managernode->first) {
			cout << "추가했습니다"<<endl;
			managernode->first = new node{ subordinate,NULL,NULL };
			return true;
		}
		else {
			cout << "추가했습니다" << endl;
			managernode->second = new node{ subordinate,NULL,NULL };
		}
		return true;
	}

};

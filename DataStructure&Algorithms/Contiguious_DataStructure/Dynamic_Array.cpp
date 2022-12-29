#include <iostream>
#include <algorithm>
#include <sstream>
#include "Dynamic_Array.h"

using namespace std;
// ����ڷκ��� size�Է¹���(size�Ҵ�)
template<typename T>
Dynamic_Array<T>::Dynamic_Array(int data_size) {
	this->data_size = data_size;
	data_ptr=new data_ptr[data_size];	//�ּ� �Ҵ�
}

template<typename T>
Dynamic_Array<T>::Dynamic_Array(const Dynamic_Array<T>& array) {
	// data_ptr = array.data_ptr; !!���� �Ҵ��ؾ� ���� ���ϴ� array�� ���� ����x
	data_size = array.data_size;
	for (auto ele : array.data_ptr)
		data_ptr[ele] = array.data_ptr[ele];
// �������� ���� �Ǵ��� Ȯ���ϱ�!! - 22.12.29
}

template<typename T>
Dynamic_Array<T>::~Dynamic_Array() {
	delete[] data_ptr;
}

template<typename T>
T& Dynamic_Array<T>::operator[](const int& index) {
	return data_ptr[index];
}

template<typename T>
const T& Dynamic_Array<T>::operator[](const int& index) const {
	return data_ptr[index];
}

template<typename T>
T& Dynamic_Array <T>::at(const int index) {
	if (index < data_size) return data_ptr[index];
	throw "Index out of range";	//class ����ο��� �߻��� �� �ִ� ����ó�����
}
template<typename T>
size_t Dynamic_Array <T>::size() {
	return data_size;
}
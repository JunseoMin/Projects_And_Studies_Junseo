#include <iostream>
#include <algorithm>
#include <sstream>
#include "Dynamic_Array.h"

using namespace std;
// 사용자로부터 size입력받음(size할당)
template<typename T>
Dynamic_Array<T>::Dynamic_Array(int data_size) {
	this->data_size = data_size;
	data_ptr=new data_ptr[data_size];	//주소 할당
}

template<typename T>
Dynamic_Array<T>::Dynamic_Array(const Dynamic_Array<T>& array) {
	// data_ptr = array.data_ptr; !!새로 할당해야 복사 당하는 array의 값에 영향x
	data_size = array.data_size;
	for (auto ele : array.data_ptr)
		data_ptr[ele] = array.data_ptr[ele];
// 범위지정 연산 되는지 확인하기!! - 22.12.29
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
	throw "Index out of range";	//class 선언부에서 발생할 수 있는 예외처리방법
}
template<typename T>
size_t Dynamic_Array <T>::size() {
	return data_size;
}
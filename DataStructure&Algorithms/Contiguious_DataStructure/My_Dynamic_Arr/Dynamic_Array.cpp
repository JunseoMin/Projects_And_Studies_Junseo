#include <iostream>
#include <algorithm>
#include <sstream>
#include "Dynamic_Array.h"

using namespace std;
// 사용자로부터 size입력받음(size할당)
template<typename T>
Dynamic_Array<T>::Dynamic_Array(int data_size) {
	this->data_size = data_size;
	data_ptr=new T[data_size];	//주소 할당
}

template<typename T>
Dynamic_Array<T>::Dynamic_Array( Dynamic_Array<T>& array) {
	// data_ptr = array.data_ptr; !!새로 할당해야 복사 당하는 array의 값에 영향x
	data_size = array.data_size;
	data_ptr = new T[data_size];
	
	for (int i = 0; i < data_size; i++) {
		data_ptr[i] = array[i];
	}
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
T& Dynamic_Array <T>::at(const int index) {	// std함수에서의 at()과 동일한 용도 => 예외처리에 유용
	if (index < data_size) return data_ptr[index];
	throw "Index out of range";							//main 에서 발생할 수 있는 예외처리방법
}

template<typename T>
size_t Dynamic_Array <T>::size() {
	return data_size;
}

template<typename T>
T& Dynamic_Array<T>::begin() {
	return data_ptr;
}

template<typename T>
const T& Dynamic_Array <T>::begin() const {
	return data_ptr;
}

template<typename T>
T& Dynamic_Array <T>::end() {
	return data_ptr + data_size;
}

template<typename T>
const T& Dynamic_Array <T>::end() const {
	return data_ptr + data_size;
}

template<typename T>
Dynamic_Array<T> operator+(const Dynamic_Array<T>& arr1,const Dynamic_Array<T>& arr2) {
	Dynamic_Array<T> Ret_Arr (arr1.size()+arr2.size());	//재정의된 operator +가 아닌 sizetype 의 sum값
	copy(arr1.begin(), arr1.end(), Ret_Arr.begin());
	copy(arr2.begin(), arr2.end(), Ret_Arr.begin()+arr1.size());

	return Ret_Arr;
}

template<typename T>
string Dynamic_Array<T>::to_string(const string& sep)
{
	if (data_size == 0) return "";

	ostringstream os;
	for (int i = 0; i < data_size; i++)
	{
		os << data_ptr[i] << sep;
	}
	return os.str();
}

#include "Music_Struct.h"
#include <iostream>
#include <algorithm>

template<typename T>
Music_Struct<T>::Music_Struct() {
	// 초기 node선언
}

template<typename T>
Music_Struct<T>::Music_Struct(Music_Struct<T>& other)
{
	// private function copy 구현


}

template<typename T>
Music_Struct<T>::~Music_Struct()
{
	// delete node
}

template<typename T>
void Music_Struct<T>::insert(T& input)
{
	if (head_ptr == NULL) {
		T = node.data;
		head_ptr = node*;
		node.next_ptr = head_ptr;
		node.previous_ptr = head_ptr;
	}
	else {
		if () {

		}
	}
}


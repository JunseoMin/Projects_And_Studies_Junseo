#pragma once
// Dynamic Array Class 구현하기
// header file
template<typename T>
class Dynamic_Array
{
public:
	Dynamic_Array(int data_size);								 // 사용자로부터 size입력받음(size할당)
	Dynamic_Array(const Dynamic_Array<T>& array); // copy constructor
	~Dynamic_Array();													 // distructor

	T& operator[] (const int& index);						// index값 참조
	const T& operator[] (const int& index) const;	// index 값 참조 const
	T& at(const int index);									// array class의 at구현
	size_t size();										// array size 반환

private:
	T* data_ptr;
	size_t data_size;
};
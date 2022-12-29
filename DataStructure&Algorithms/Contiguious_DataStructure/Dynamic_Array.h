#pragma once
// Dynamic Array Class �����ϱ�
// header file
template<typename T>
class Dynamic_Array
{
public:
	Dynamic_Array(int data_size);								 // ����ڷκ��� size�Է¹���(size�Ҵ�)
	Dynamic_Array(const Dynamic_Array<T>& array); // copy constructor
	~Dynamic_Array();													 // distructor

	T& operator[] (const int& index);						// index�� ����
	const T& operator[] (const int& index) const;	// index �� ���� const
	T& at(const int index);									// array class�� at����
	size_t size();										// array size ��ȯ

private:
	T* data_ptr;
	size_t data_size;
};
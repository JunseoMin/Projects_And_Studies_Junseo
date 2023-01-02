#pragma once
// Dynamic Array Class 구현하기
// header file
template<typename T>
class Dynamic_Array
{
	friend Dynamic_Array<T> operator+ (const Dynamic_Array<T>& arr1,const Dynamic_Array<T>& arr2);
	//friend 로 구현시 선언부에서만 friend선언
	//friend는 클래스 내부함수로 반영되지 않음
public:
	Dynamic_Array(int data_size);								 // 사용자로부터 size입력받음(size할당)
	Dynamic_Array(Dynamic_Array<T>& array);			// copy constructor
	~Dynamic_Array();													 // distructor

	T& operator[] (const int& index);						// index값 참조
	const T& operator[] (const int& index) const;	// index 값 참조 const
	T& at(const int index);									// array class의 at구현
	size_t size();										// array size 반환
	T& begin();
	const T& begin()const;
	T& end();
	const T& end()const;
	std::string to_string(const std::string& sep=" , ");		//선언부에서 std 클래스 사용시에는 namespace 명시

private:
	T* data_ptr;
	size_t data_size;
};

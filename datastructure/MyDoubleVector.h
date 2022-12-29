#pragma once

class MyDoubleVector
{
public:
	MyDoubleVector(size_t init_capacity = Default_Capacity); //constructor
	MyDoubleVector(const MyDoubleVector& v);
	~MyDoubleVector(); //destructor

	//operators
	void operator+=(MyDoubleVector v);				// append RHS vector
	double& operator[](size_t index);				// return index of data 
	MyDoubleVector operator+(MyDoubleVector v);		// sum LHS data and RHS data
	MyDoubleVector operator-(MyDoubleVector v);		// 
	double operator*(MyDoubleVector v);				// 
	MyDoubleVector operator-();						// 
	bool operator==(MyDoubleVector v);				// return true or false by comparing all of two data
	void operator()(double d);			// make data double d
	void operator=(MyDoubleVector v);		// operator (=) for deep copy

	//member functions
	void pop_back();
	void push_back(double x);
	size_t capacity() const;
	size_t size() const;
	void reserve(size_t n);
	bool empty()const;
	void clear();

private:
	static const size_t Default_Capacity = 100; //default size
	double* data;								//array of start vector
	size_t V_capacity;							//full size of vector user can use
	size_t used;								//how many index MV used, same as size in vector
};

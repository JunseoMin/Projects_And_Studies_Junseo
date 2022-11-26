#include <iostream>
#include <algorithm> //copy function
#include <cassert> //assert
#include <cstdlib>
#include "MyDoubleVector.h"

using namespace std;

MyDoubleVector::MyDoubleVector(size_t init_capacity) {	// precondition: declare MyDoubleVecor
	data = new double[init_capacity];					// Received new double[] memory allocation to get vector
	V_capacity = init_capacity;							// vector amount user can use
	used = 0;											// count capacity used
}														// postcondition: MyDoubleVector declared, with initcapacity(default=100)

MyDoubleVector::MyDoubleVector(const MyDoubleVector& v) {	// precondition: vector to be copied must be declared
	data = new double[v.V_capacity];						// postcondition: create a new vector with the same element
	V_capacity = v.V_capacity;
	used = v.used;
	copy(v.data, v.data + v.used, data);
}

MyDoubleVector::~MyDoubleVector() {
	//postcondition: clear data
	delete[] data;
}

void MyDoubleVector::operator=(MyDoubleVector v) {	//precondition: vectors must be declared
	used = v.used;									//posstcondition: LHS vector will have a same elements
	V_capacity = v.V_capacity;
	copy(v.data, v.data + v.used, data);
}

void MyDoubleVector::operator+=(MyDoubleVector v) {
													// precondition: none
	if (used + v.used > V_capacity) {				// if V_capacity < appended capacity Make V_capacity size double 
		reserve(V_capacity * 2);
	}
	copy(v.data, v.data + v.used, data + used);
	used += v.used;									// used should be increased
}

double& MyDoubleVector::operator[](size_t index) {
	assert(used > index);							// precondition: index must be smaller than used elements
	return data[index];								// postcondition: return array of data[index]
}

MyDoubleVector MyDoubleVector::operator+(MyDoubleVector v) {
	// precondition : RHS's size == LHS's size
	// postcondition : return MyDoubleVector type
	assert(used == v.used);
	MyDoubleVector res(*this);

	for (int i = 0; i < used; i++)
	{
		res.data[i] = data[i] + v.data[i];
	}

	return res;
}

MyDoubleVector MyDoubleVector::operator-(MyDoubleVector v) {
	// precondition : RHS's size == LHS's size
	//postconditions: all resualts will be >=0
	//				  RHS's size = LHS's size
	assert(used == v.used);

	MyDoubleVector res(*this);
	for (int i = 0; i < used; i++)
	{
		if (data[i] >= v.data[i])
		{
			res.data[i] = data[i] - v.data[i];
		}
		else
		{
			res.data[i] = v.data[i] - data[i];
		}
	}
	return res;
}

double MyDoubleVector::operator*(MyDoubleVector v) {	//precondition: none
	double resSize=0.0;									//postcondition: return double type
	for (int i = 0; i < used; i++)
	{
		resSize += data[i] * v.data[i];
	}
	return resSize;
}


MyDoubleVector MyDoubleVector::operator-() {			// precondition: none
														// postcondition: return another MydoubleVectortype with data reversed
	MyDoubleVector res(*this);
	for (int i = 0; i < used; i++)
	{
		res.data[i] = data[i] * -1;
	}
	return res;
}

bool MyDoubleVector::operator==(MyDoubleVector v) {	//precondition: none
	if (size() != v.size()) {						//postcondition: return booltype
		return false;
	}
	else {
		for (int i = 0; i < used; i++)
		{
			if (data[i] != v.data[i]) {
				return false;
			}
			else return true;
		}
	}
}

void MyDoubleVector::operator()(double d) {		//postcondition: all capacity values will be double d
		for (int i = 0; i < V_capacity; i++)
		{
		data[i] = d;
		used++;										//found err
		}
}

void MyDoubleVector::pop_back() {
	//precondition: used shoud be bigger than 0
	assert(used > 0);
	used--;
	//postcondition: last data will be disallocated
}

void MyDoubleVector::push_back(double x) {
	//precondition: none
	//postcondition: ++used, if capacitiy=used capacitiy will be double sized
	if (used < V_capacity) {
		data[used] = x;
		used++;
	}
	else {
		reserve(V_capacity + V_capacity);
		data[used] = x;
		used++;
	}
}

size_t MyDoubleVector::capacity()const {
	//precondition: none
	return V_capacity;
}

size_t MyDoubleVector::size() const {
	//precondition: none
	return used;
}

void MyDoubleVector::reserve(size_t n) {
	//precondition: n should be bigger than V_capacity
	//postcondition: data size shold will be bigger than before
	double* newvec;
	newvec = new double[n];
	if (V_capacity >= n) {
		return;
	}
	else {
		copy(data, data + used, newvec);
		delete[] data;
		data = newvec;
		V_capacity = n;
	}
}

bool MyDoubleVector::empty() const {
	//precondition: none
	if (used == 0) {
		return true;
	}return false;
}

void MyDoubleVector::clear() {
	//postcondition: remove all of vector elements
	delete[] data;
	used = 0;
	V_capacity = 0;
}

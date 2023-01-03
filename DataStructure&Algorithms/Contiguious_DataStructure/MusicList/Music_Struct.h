#pragma once
template<typename T>
struct Music_node {
	T* data;
	Music_node* previous_ptr;
	Music_node* next_ptr;


};



template<typename T>
class Music_Struct
{
public:
	Music_Struct();
	Music_Struct(Music_Struct<T>& other);
	~Music_Struct();

	void insert(T& input);
	void remove();
	void print_all();
	Music_Struct& previous();
	Music_Struct& next();

private:
	Music_node node;
	Music_node* head_ptr;
};
#include <iostream>
#include <array>

/*예제코드+개념
*	연속된 자료구조는 단일 메모리 청크에 저장
*	정적 배열(array): stack memory 영역에 저장됨 => 함수를 벗어나면 메모리 자동할당 해제됨
*	동적배열(linked list): heap메모리 영역에 저장됨 => 사용자가 직접 메모리를 할당해제 해야함.
*
*  cache locality: 연속된 자료구조는 배열 주변 원소도 cache로 가져옴.
*
*	linked list, array 비교
*		linked list는 데이터의 삽입에 유리 / 탐색에 불리
*		array는 cache locality 때문에 탐색에 유리 / 삽입에 불리
* 
*  erro처리, 범위지정 반복 예제코드
*/

using namespace std;
template<size_t N>
void print_A(const array<int, N> &arr);
template<size_t N> 
void print_iter(const array<int, N> &arr);

int main()
{
	//array error처리 예제
	array<int, 4> a = { 1,2,3,4 }; // []연산자 이용한 배열보다 에러 처리에 손쉬움.
	try
	{
		for (int i = 0; i < 5; i++) {
			cout << a.at(i) << endl;	// [i]사용시에는 error처리가 어려움  -> if어쩌구 사용..
		}
	}
	catch (const exception& e)
	{
		//i=4,5에서 error출력
		cerr << e.what() << endl;
	}

	//array 함수전달 예제
	print_A(a);
	// [] 사용시보다 전달하기 수월, 가독성 유리
	print_iter(a);
}

template<size_t N> // template사용으로 깊은복사됨, 범용성 상승
void print_A(const array<int, N> &arr) {
	//Range-based for loop 
	for (auto ele : arr) {	
		//auto 변수명 선언 : 범위(array)
		cout << ele << ' ';
	}
	cout << endl;
}

template<size_t N> //iterator 이용한 출력문
void print_iter(const array<int, N> &arr) {
	for (auto it = arr.begin(); it != arr.end();it++) {
		auto ele =( *it);
		cout << ele << ' ';
	}
}
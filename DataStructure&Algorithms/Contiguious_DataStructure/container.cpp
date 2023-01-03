#include <iostream>
#include <array>
#include <type_traits>
using namespace std;

template <typename ... Args>    // 가변길이 템플릿 -> 0개 이상의 파라미터 나타냄
auto build_Array(Args&&... args)->array<typename common_type<Args...>::type, sizeof...(args) >{  //common_type 템플릿 이용해서 컴파일 단계에서 파라미터 지정하기, 후행 리턴타입.
    using commonType = typename common_type<Args...>::type; // array생성
    return { forward < commonType>((Args&&)args)... };
}
int main()
{
    auto data1 = build_Array(1, 5, 4, 4, 5, 6);  //파라미터 자료형이 다르면 입력안됨

    for (auto i : data1) cout << i << " ";
}

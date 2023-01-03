#include <iostream>
#include <string>
#include <forward_list>

using namespace std;

struct citizen {
    string name;
    int age;
};

ostream& operator<<(ostream& os, const citizen c) { return (os << "[" << c.name <<","<< c.age << "]"); }
// << operator 제공하는 citizen struct 생성

int main()
{
    forward_list<citizen> citizen_list = { {"Junseo",24}, {"steven",30},{"lee",10} };
    auto citizen1 = citizen_list;

    citizen1.remove_if([](const citizen& c) {  //lamda함수 [캡쳐] (매개변수)  {함수동작} (호출인자-> 함수 호출시에만 사용)
        //remove if 는__Pr1을 만족하는 인자 삭제
        return c.age > 18;
        });

    for (const auto &c : citizen1)
    {
        cout << c << endl;
    }
}

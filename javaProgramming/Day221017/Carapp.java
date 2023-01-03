package Day221017;

public class Carapp {
    public static void main(String[] args) {
        Car c1= new Car();      // 힙 메모리 할당
        c1.carname="차 이름";   // 포인터 힙 주소로  
        c1.carcolor="검정";
        c1.carcompany="gg";

        c1.prtCarinfo();
    }
    
}

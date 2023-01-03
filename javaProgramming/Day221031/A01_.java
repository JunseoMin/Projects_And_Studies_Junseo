package Day221031;

class Duck{                 // 객체 내부 변수는 기본 초기화를 함.
    private int ducksize;
    private String duckname;

    public Duck(){
        ducksize=500;
        duckname="붉은머리오리";
        System.out.println("오리 객체 생성");
        System.out.println(ducksize + ":" + duckname );
    }
}

public class A01_ {
    public static void main(String[] args) {
        new Duck(); // 생성자 호출
                    // 객체 생성시 가장 먼저 수행되는 메소드
                    // 매개변수는 있으나, 반환 유형 존재하지 않음
        
        
    }
}

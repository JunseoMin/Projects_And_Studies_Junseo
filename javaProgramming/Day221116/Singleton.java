package Day221116;

// 프로그램실행중 특정 객체가 메모리상에 단독으로만 있어야 되는 경우 -> 싱글턴 패턴
// 싱글턴 패턴 -> 메모리상의 유일무이한 객체
//              > 네트워크 연결, 데이터베이스 연결 -> 그연결갹채도 한개만 존재
//              **생성자에 주의

 class other{
    public other(){

    }
 }



public class Singleton {
    private static Singleton instance=new Singleton();  //스태틱은 메모리상에서 한개만 존재 

    private Singleton() {//생성자를 프라이빗으로 만들면 다른 클래스에서 생성 안됨
        // 객체 생성 코드
        System.out.println("싱글턴객체 생성  메모리상 하나밖에읍ㅅ음");
    }
    public static Singleton get_instane(){
        return instance;
    }

    public static void main(String[] args) {
        Singleton s1=Singleton.get_instane();   
    }
    
}

package Day221107;
//추상 클래스 -> 객체 상속간의 상위 클래스, 하위 클래스로 확장/ 상속 해야하며, 한개 이상의 추상 메소드 보유 => 추상 메소드가 있으면 추상 클래스!
// 추상 메소드: 중괄호가 없고, 접근자 메소드명(매개변수) 있음 ==> public(접근자) void mathod name (int s);
// 추상 클래스는 new키워드는 객체 생성 불가능

abstract class animal { // 추상 클래스 선언

    abstract public void eating();  //상속해서 재정의 해야하는 추상 메소드 선언
    public void moving(){
        System.out.println("동물은 움직여용");
    }

    public void play(){
        System.out.println("놀앙");
    }
}

class dog extends animal{

    @Override
    public void eating() {
        // TODO Auto-generated method stub
        System.out.println("잡식");
    }
    
}

class cow extends animal{

    @Override
    public void eating() {
        // TODO Auto-generated method stub
        System.out.println("초식");
    }

}

class Tiger extends animal{

    @Override
    public void eating() {
        // TODO Auto-generated method stub
        System.out.println("고기먹엉");
    }
    

}


public class X01 {
    public static void main(String[] args) {
        //animal a= new animal(); 추상 클래스라서 new 불가능
        Tiger t1 = new Tiger();
        cow c1 = new cow();
        
    }
}

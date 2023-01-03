package Day221107;
//인터페이스 => 추상 메소드, 추상 클래스 => 추상 메소드+일반메소드
// 자바에서는 인터페이스여러개 상속 ㄱㄴ 하지만 클래스는 여러개 상속 안됨
interface pet{  //인터페이스는 추상 메소드만 존제
    abstract public void play();
}

abstract class animal00 { // 추상 클래스 선언

    abstract public void eating();  //상속해서 재정의 해야하는 추상 메소드 선언
    public void moving(){
        System.out.println("동물은 움직여용");
    }

}

abstract class aannii extends animal00{
    
}

class dog0 extends animal00 implements pet{

    @Override
    public void eating() {
        // TODO Auto-generated method stub
        System.out.println("잡식");
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("잘놀아");
    }
       
}
class Tiger0 extends animal00{

    @Override
    public void eating() {
        // TODO Auto-generated method stub
        System.out.println("고기먹엉");
    }
    

}

class cat extends animal00 implements pet{

    @Override
    public void eating() {
        // TODO Auto-generated method stub
        System.out.println("잡");
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("잘놀");
    }
    
}

public class X02 {
    
}

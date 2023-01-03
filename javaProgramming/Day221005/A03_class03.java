//자바는 object class 에서 상속받음

package Day221005;
class shape{
    public void rotate(){
        System.out.println("도형이 클릭되면 회전하는 메소드");
    }

    public void playsound(){
        System.out.println("음악이 나오는 코드");
    }
}

class square extends shape{}
class circle extends shape{}
class triangle extends shape{}
class amoeba extends shape{
    @Override
    public void rotate(){
        System.out.println("아메바 모양은 달랑! 아무튼 다름");
    }
    @Override
    public void playsound(){
        System.out.println("다른소리 나옴");
    }
}


public class A03_class03 {
    public static void main(String[] args) {
        triangle t = new triangle();
        t.rotate();
        t.playsound();

        amoeba amo = new amoeba();
        amo.rotate();
        amo.playsound();

    }
    
}

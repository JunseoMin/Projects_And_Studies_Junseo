package Day221005;

class Duck {
    
    public Duck(){
        System.out.println("Duck Object Instane. ");
    }
    public void rotate(){
        System.out.println( "도형이 클릭되면 회전하는 메소드");
    }
    public void playsound(){
        System.out.println("음악이 나오는 코드");
    }

}

public class A01_Class01 {
    public static void main(String[] args) {
        Duck d;



        d = new Duck();//힙메모리의 할당,(생성)
    }
    
}

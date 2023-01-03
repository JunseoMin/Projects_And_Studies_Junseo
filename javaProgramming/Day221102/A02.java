package Day221102;

class QWER{
    private int speed;

    public void setspeed(int speed) {
        this.speed=speed;
        
    }

    public int Tspeed() {
        return this.speed;
    }

    public QWER(){
        System.out.println("QWER");
    }
    public void ptrQWER() {
        System.out.println("qwe 메소드");
    }

    protected void qwerqwer() {
        System.out.println("qwerqwer");
    }
}

class ASDF extends QWER{
    public ASDF(){
        System.out.println("ASDF");
    }
    @Override
    public void ptrQWER() {
        System.out.println("qwe 메소드");
        System.out.println("qwe 메소드");
    }
}


public class A02 {
    public static void main(String[] args) {
        ASDF asdf=new ASDF();// 상속 아니라 뭘까? -과제
        asdf.setspeed(500);
        asdf.Tspeed();
        // 캡슐화 
    }
}

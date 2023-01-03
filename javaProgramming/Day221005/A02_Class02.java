package Day221005;

class Duck02{
    public void printDuck02(){
        System.out.println("duck02 object! ");
    }
}

class WaterDuck02 extends Duck02 { //상속, 확장(메소드 확장)
}

class RedHeadDuck02 extends Duck02{
    //overriding
    @Override //method 재정의
    public void printDuck02(){
        System.out.println("RHD02!!!");
        System.out.println("RHD02!!!");
    }
}

public class A02_Class02 {
    public static void main(String[] args) {
    WaterDuck02 wd2 = new WaterDuck02(); //객체 생성
    
    wd2.printDuck02();

    RedHeadDuck02 rhd=new RedHeadDuck02();
    rhd.printDuck02();
    }
}







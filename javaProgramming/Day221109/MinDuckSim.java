package Day221109;

// 인터페이스 타입의 변수 설정!!!!

interface swim_beh{
    public void swim_beh();
}

class basic_swim implements swim_beh {

    @Override
    public void swim_beh() {
        // TODO Auto-generated method stub
        System.out.println(" 다리로 수영한디");    
    }
    
}



interface Quack_beh{
    public void quack();
}

class Quack implements Quack_beh{

    @Override
    public void quack() {
        // TODO Auto-generated method stub
        System.out.println("꽥꽥");    
    }
    
}

class mute implements Quack_beh{

    @Override
    public void quack() {
        // TODO Auto-generated method stub
        System.out.println("말못행");    
    }
    
}




interface fly_beh{
    public void fly();
}

class flywings implements fly_beh{

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("생물학적 날개를 이용해 날아가는 코딩~");    
    }
    
}

class flynoway implements fly_beh{

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("못날아~ ");        
    }

}
class fly_super implements fly_beh{

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("엔진달림");    
    }
    
}


abstract class duck{
    fly_beh fly_beh;
    Quack_beh quack_beh;

    public void set_fly(fly_beh fb) {
        this.fly_beh=fb;
    }
    public void set_quack(Quack_beh qb) {
        this.quack_beh=qb;
    }

    public duck(){
    }
    public void performed_fly(){//변수 대행 메소드
        this.fly_beh.fly();
    }
    public void performed_quack(){
        this.quack_beh.quack();
    }
}

class mallardduck extends duck {

    public mallardduck() {
    fly_beh=new flywings();
    quack_beh = new Quack();
    }
    public void display() {
        System.out.println("mallarduck입니다잉");
    }
    
}

class woodduck extends duck{

    public woodduck() {
        fly_beh=new flynoway();
        quack_beh=new mute();
    }
    public void display() {
        System.out.println("나무오립니당");
    }

}

public class MinDuckSim {
    public static void main(String[] args) {
        mallardduck md = new mallardduck();
        md.display();
        md.performed_fly();
        md.performed_quack();
        md.set_fly(new flynoway());
        md.performed_fly();

        woodduck wd = new woodduck();
        wd.set_fly(new fly_super());
        wd.performed_fly();

    }
}

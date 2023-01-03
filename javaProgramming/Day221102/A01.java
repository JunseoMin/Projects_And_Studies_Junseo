package Day221102;

class Temp{
    public String msg;

    public void setmsg(String mssg){
        this.msg=mssg;

    }

    void connectmsg(String msString[]){}
    public String Printmsg(){
        return this.msg;
    }

}//super class

class Exttemp extends Temp{
    @Override
    public String Printmsg(){
        System.out.println(this.msg);
        return this.msg;
    }
}

class EEt extends Temp
{
    @Override
    public void setmsg(String mssg){
        System.out.println(this.msg);
    }
}

public class A01 {
    public static void main(String[] args) {
    Exttemp t1=new Exttemp();
    
    t1.setmsg("메소드 오버라이드");
        
    System.out.println(t1.Printmsg());

    EEt hi=new EEt();
    }
}          
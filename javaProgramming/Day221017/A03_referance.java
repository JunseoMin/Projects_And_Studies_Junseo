package Day221017;

class other{
    public void printother(String str){
        System.out.println("str참조주소: "+str.hashCode());
    }
}

public class A03_referance {
    public static void main(String[] args) {
        String mstr=new String("hihi");
        System.out.println(mstr.hashCode());
        other ot = new other();
        ot.printother(mstr);
    }
    
}

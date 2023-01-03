package Day220928;

public class A01_array {
    public static void main(String[] args) {
        int[] sd=new int [10]; //sd 변수에는 주소위치만 저장됨
    
        System.out.println(sd);
        System.out.println(sd[0]);

        //인덱스 번호로 제어

        sd[0]=100;
        sd[1]=200;
        sd[4]=-20;

        System.out.println(sd[0]);
        System.out.println(sd[1]);
        System.out.println(sd[4]);
    }
    
}

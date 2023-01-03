public class A05_Char {
    public static void main(String[] args){
        int x=50000;
        long y;
                // long값이 int보다 메모키 커서 문제 안생김
        y=x;    //x값 long으로 형변환

        long w=1234L;
        int q;
       //q=w;    //에러 발생 : long이 int보다 큼
        q=(int)w;//강제 형변환 에러 발생x, 데이터 손실 있음, 포함 안되는 데이터는 **삭제**
        System.out.println(q);

    }
    
}

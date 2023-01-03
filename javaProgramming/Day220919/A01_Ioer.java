package Day220919;

public class A01_Ioer {
    public static void main(String[] args) {
        //보수연산 ex)9-4 = > +9+(-4) 
        //1의 보수 : 10진수-> 2진수 변환 -? 0을 1로, 1을 0으로
        //2의 보수 : 1의 보수 +1
        // 특정 정수 숫자를 1의 보수 한 후 2의 보수를 취할 경우 부호가 바뀜

        int num=-200;
        System.out.println("number: "+num);
        System.out.println("num 1의 보수: "+~num);
        int n2=~num+1;
        System.out.println("num의 보수+1: "+n2);

        //시프트 연산자
        //비트에 위치를 이동시켜서 숫자 연산
        int invalue=100;
        System.out.println("100의 쉬프트 이동: "+invalue);
        int shiftR=invalue>>1;
        System.out.println("100의 오른쪽 쉬프트 이동: "+shiftR);
        int shiftR1=shiftR>>1;
        System.out.println("100의 쉬프트 이동: "+shiftR1);

        int a=2; int b=4;
        int c=a&b;
        //이진수 곱연산
        System.out.println(c);
    }
    
}

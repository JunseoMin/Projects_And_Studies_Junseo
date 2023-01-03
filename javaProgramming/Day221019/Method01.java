package Day221019;
import java.util.Scanner;

// mathod == function < module < package < library < api,beans(jar file), component(.dll)
// static => 메모리에 프로그램 실행 전에 할당

public class Method01 {
    static Scanner scan =new Scanner(System.in);

    public static void strdis(int n) {
        for (int i=1;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.println("*");
            }
        }
    }

    public static double area(int r) {
        double are=r*r*3.14;
        return are;
    }

    public static void display() {
        System.out.println("~~~~~~~~~~~~~~");
    }

    public static int inputnum(){
        System.out.println("제곱을 구하는 정수 입력: ");
        return scan.nextInt();
    }

    public static int processnum(int num) {
        int res=num*num;
        return res;
    }

    public static void outputnumber(int num, int res) {
        System.out.println(num+" x " + num + " = " +res);        
    }

    public static void main(String[] args) {
    
        System.out.println(area(10));
        strdis(20);
        int num=inputnum();
        int res=processnum(inputnum());
        outputnumber(num,res);
        display();
    }
}

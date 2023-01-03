package Day221019;

import java.util.Scanner;
/*
 * public: 다른 객체, 메소드 접근 가능
 * 
 * private: 다른 객체, 메소드 접근 불가능(본인은 ㄱㄴ,해당하는 클래스는 접근이 가능)
 * 
 * protected: 같은 패키지에 포함되는 메소드만 접근 ㄱㄴ
 *           -다른 패키지에서 접근 불가능.
 * 
 * default: 같은 패키지에 포함되는 메소드만 접근
 * 
 * 접근 == .
 */
public class method02{

    public void strdis(int n) {
        for (int i=1;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.println("*");
            }
        }
    }

    public double area(int r) {
        double are=r*r*3.14;
        return are;
    }

    public void display() {
        System.out.println("~~~~~~~~~~~~~~");
    }

    public int inputnum(Scanner scan){
        System.out.println("제곱을 구하는 정수 입력: ");
        return scan.nextInt();
    }

    public int processnum(int num) {
        int res=num*num;
        return res;
    }

    public void outputnumber(int num, int res) {
        System.out.println(num+" x " + num + " = " +res);        
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        method02 m=new method02();
        int key=scan.nextInt();

        switch (key) {
            case 1:
            System.out.println(m.area(10));
                break;
            case 2:
            m.strdis(10);
                break;
            default:
            int num=m.inputnum(scan);
            int res=m.processnum(num);
            m.outputnumber(num, res);
                break;
        }
    }
}
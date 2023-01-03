import java.util.Scanner;

//scaner객체(Object)
//import java.util.Scanner;

public class A05_ScanEx1{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        //new는 객체 생성 - 힙 메모리 할당
        //ctrl+.으로 빠르게 생성
        System.out.print("학번: ");
        int num = scan.nextInt();

        System.out.print("나이: ");
        int age = scan.nextInt();

        
    }

}
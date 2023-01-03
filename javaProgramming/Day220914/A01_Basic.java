import java.util.Scanner;

public class A01_Basic{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        System.out.print("문자열 입력:");
        String str1=scan.nextLine();//next(line,int,double etc..)

        System.out.println("입력된 문자열은 "+str1);

        scan.close();//스캐너 끝내기 (안써도됨)
    }
    
}
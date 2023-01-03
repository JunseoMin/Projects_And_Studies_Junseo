package Day220919;
import java.util.Scanner;

public class A07_if05 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("choose Y/N: ");
        char f=scan.next().charAt(0);
        if(f=='Y'){
            System.out.println("Y선택");

        }else if(f=='y'){
            System.out.println("y선택");

        }else if(f=='N'){
            System.out.println("y선택");

        }else if(f=='N'){
            System.out.println("y선택");

        }else{
            System.out.println("잘못된 선택");
        }
    }
    
}

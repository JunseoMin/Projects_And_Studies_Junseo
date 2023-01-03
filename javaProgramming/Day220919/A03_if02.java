package Day220919;
import java.util.Scanner;
public class A03_if02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        int num=scan.nextInt();
        if(num<0){
            num=0;
        }
        System.out.println("입력된 num: "+num);
        
    }
}
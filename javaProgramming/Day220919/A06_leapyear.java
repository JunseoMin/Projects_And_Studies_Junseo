package Day220919;
import java.util.Scanner;

public class A06_leapyear {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("알고싶은 윤년 연도: ");
        int y = scan.nextInt();
        if(((y % 4 == 0)&&(y % 100 != 0))||(y%400==0)){
            System.out.println(y+" 년은 윤년입니다." );
        }
        else{
            System.out.println("윤년아닙니다. ");
        }
        
    }
    
}

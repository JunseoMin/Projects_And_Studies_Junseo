import java.util.Scanner;

public class A04_char {
    public static void main(String[] args){
        char ch ='c';
        System.out.println(ch);
        Scanner scan= new Scanner(System.in);

        System.out.print("문자 한개 입력");
        char key = scan.next().charAt(1);
        //index 값 = 문자 주소 ////// 문자 '한개' 받기 1

        String temp = scan.next();
        char k = temp.charAt(0);
        // 문자 '한개' 받기 2

        System.out.println(key);
    }
    
}

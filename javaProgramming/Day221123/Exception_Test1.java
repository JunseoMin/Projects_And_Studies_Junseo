package Day221123;

import java.util.Scanner;

class Anything{
    Scanner scan =new Scanner(System.in);
    public Anything(){
        try {
            System.out.println("젯수");
        int num1= scan.nextInt();
        System.out.println("피젯수");
        int num2=scan.nextInt();

        double res=num1/num2;  //exception    
        System.out.println(res);
        } catch (Exception e) {//exception중 최상위 객체-> 이거 하나로 모든 예외처리 ㄱㄴ
            // TODO: handle exception
            System.out.println("error");
        }finally{//예외 발생 상관없이 무조건 실행
            scan.close();
        }
         
    }
}

public class Exception_Test1 {
    public static void main(String[] args) {
     new Anything();   
    }
}

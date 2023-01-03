import java.util.Scanner;

public class A09_comp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password="moon1!";
        System.out.print("비밀번호 입력: ");
        String upass = scan.next();
    
        boolean login = password.equals(upass);
        System.out.println(login);

        System.out.print("keep?");
    }
    
}

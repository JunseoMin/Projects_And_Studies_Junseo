package Day221031;

import java.util.Scanner;

import javax.swing.JFrame;

class winduck extends JFrame{
    public winduck(){                   //default constructor
        this.setSize(500,500);
        this.setTitle("window size");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //다양한 추가 코드

        this.setVisible(true);
    }
    public winduck(int height, int width, String title){
    
        this.setSize(width,height);
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //다양한 추가 코드
    
        this.setVisible(true);

        // 생성자 여러개인것--->> 생성자 오버로딩
    }
    
}


public class A03_ {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        new winduck(800,600,"asdsadasd");
        
        System.out.println("생성될 오리 선탹: ");
        int choice= scan.nextInt();
        if (choice==1){
            new winduck();
        }else{
            new winduck(800, 600, "title");
        }
        
    }    
}

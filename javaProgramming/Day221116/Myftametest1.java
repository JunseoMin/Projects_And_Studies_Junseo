package Day221116;

import java.awt.Color;

import javax.swing.*;// 기본 생성자

class myframe1 extends JFrame{
    JButton btn1,btn2,btn3; // 전역변수같은느낌
    
    public myframe1(){
        this.setSize(300, 200);
        this.setTitle("제목글");
        this.setLocation(500, 400); // 창이 켜질 위치지정
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 메모리에서 제거

        this.getContentPane().setBackground(Color.BLUE);

        // JButton btn1=new JButton("버튼1");
        
        // this.add(btn1);
        this.setVisible(true);
    }
}

public class Myftametest1 {
    public static void main(String[] args) {
        new myframe1();
    }
    
}

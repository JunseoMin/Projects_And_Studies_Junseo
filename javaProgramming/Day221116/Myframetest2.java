package Day221116;

import java.awt.*;
import javax.swing.*;// 기본 생성자
import javax.swing.text.FlowView;

class myframe2 extends JFrame{
    JButton btn1,btn2,btn3,btn4,btn5;

    public myframe2(){
        this.setSize(300, 200);
        this.setTitle("제목글");
        this.setLocation(500, 400); // 창이 켜질 위치지정
        this.setLayout(new ViewportLayout());


        btn1= new JButton("북");
        btn2= new JButton("남");
        btn3= new JButton("동");
        btn3= new JButton("서");

        this.setVisible(true);
    }
}

public class Myframetest2 {
    public static void main(String[] args) {
        new myframe2();
    }
    
}

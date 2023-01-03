package Day221121;

import java.awt.FlowLayout;
import java.awt.*;
import javax.swing.*;

class eventT5 extends JFrame{

    JButton btn;
    JTextField txt;
    JPanel pannel;
    eventT5(){
    this.setSize(500,150);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    pannel=new JPanel();
    txt=new JTextField(10);
    btn=new JButton("asd");
        
    pannel.add(txt);
    pannel.add(btn);

    this.add(pannel,BorderLayout.EAST);
    // this.add(pannel,BorderLayout.SOUTH);

    this.setVisible(true);
    }
}

public class eventtest_5 {
    public static void main(String[] args) {
        new eventT5();
    }
}

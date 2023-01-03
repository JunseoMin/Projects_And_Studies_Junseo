package Day221121;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

class eventT1 extends JFrame implements ActionListener{
    JButton btn1,btn2,btn3;
    JLabel lbl;
    int cnt=0;

    public eventT1(){// 라스너 --> 옵저버 패턴 
        this.setSize(500,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        lbl=new JLabel("카운트: "+cnt);

        btn1= new JButton("cnt 증가");
        btn1.addActionListener(this);

        btn2=new JButton("감소");
        btn2.addActionListener(this);

        btn3=new JButton("clear");
        btn3.addActionListener(this);

        this.add(lbl);
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        // JOptionPane.showMessageDialog(null,"메시지창");
        // if(e.getSource()==btn1){
        //     cnt++;
        //     lbl.setText("현재 카운트: "+cnt);
        // }else if(e.getSource()==btn2) {
        //     cnt--;
        //     lbl.setText("현재 카운트: "+cnt);
        // }else if(e.getSource()==btn3){
        //     cnt=0;
        //     lbl.setText("현재 카운트: "+cnt);
        // }  ---- 가독성 낮음

        // switch (e) {
        //     case value:
                
        //         break;
        
        //     default:
        //         break;
        // }
    }
}

public class event_test1 {
    public static void main(String[] args) {
        new eventT1();
    }
}

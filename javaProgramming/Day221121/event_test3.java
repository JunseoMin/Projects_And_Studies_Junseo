package Day221121;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

class eventT3 extends JFrame{
    JButton btn1,btn2,btn3;
    JLabel lbl;
    int cnt=0;

    public eventT3(){// 라스너 --> 옵저버 패턴 
        this.setSize(500,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        lbl=new JLabel("카운트: "+cnt);
        btn1= new JButton("cnt 증가");
        btn2=new JButton("감소");
        btn3=new JButton("clear");

        btn1.addActionListener(e -> {
            cnt++;
            lbl.setText("현재 카운트 "+cnt);
            System.out.println("현재 카운트 "+cnt);
        });

        btn2.addActionListener(e -> {
            cnt--;
            lbl.setText("현재 카운트 "+cnt);
            System.out.println("현재 카운트 "+cnt);
        });

        
        btn3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                cnt=0;
                lbl.setText("현재 카운트 "+cnt);
                System.out.println("현재 카운트 "+cnt);
            }
        });

        this.add(lbl);
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.setVisible(true);
    }

}

public class event_test3 {
    public static void main(String[] args) {
        new eventT3();
    }
}

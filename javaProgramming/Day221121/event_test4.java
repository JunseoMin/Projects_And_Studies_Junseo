package Day221121;
import java.awt.FlowLayout;
//import java.awt.event.*;
import javax.swing.*;

class simpC extends JFrame{
    JTextField txt1,txt2;
    JButton btnP,btnM,btnC,res;
    public simpC(){
        this.setSize(500,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        txt1=new JTextField(5);
        txt1=new JTextField(5);


        btnP=new JButton("+");
        btnM=new JButton("-");
        btnC=new JButton("CE");
        res=new JButton("res");

        btnP.addActionListener(e->{
            if(txt1.getText().equals("")||txt2.getText().equals("")){
                JOptionPane.showInputDialog(null,"값을 입력");
            }else{

                int v1=Integer.parseInt(txt1.getText());
                int v2=Integer.parseInt(txt2.getText());
                String res=Integer.toString(v1+v2);
                JOptionPane.showConfirmDialog(null, res);
                
            }
        });
        btnM.addActionListener(e->{
            if(txt1.getText().equals("")||txt2.getText().equals("")){
                JOptionPane.showInputDialog(null,"값을 입력");
            }else{
                String res=Integer.toString(Integer.parseInt(txt1.getText())-Integer.parseInt(txt2.getText()));
                JOptionPane.showConfirmDialog(null, res);
            }
        });
        // res.addActionListener(e->{
            
        // });
        btnC.addActionListener(e->{
            txt1.setText("");
            txt2.setText("");
        });
        this.add(txt1);
        this.add(txt2);
        this.add(btnP);
        this.add(btnM);
        //this.add(res);
        this.add(btnC);

        this.setVisible(true);
    }
}

public class event_test4 {
    public static void main(String[] args) {
        new simpC();
    }
}
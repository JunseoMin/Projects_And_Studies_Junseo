import javax.swing.JButton;
import javax.swing.JFrame;

class winduckw2 extends JFrame{
    public winduckw2(){
        this.setSize(800,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);

        JButton button = new JButton();
        button.setText("눌렁");
        JButton btn =new JButton("냐");

        this.add(button);
        this.add(btn);

        this.setVisible(true);
    }

}


public class A05_ {
    public static void main(String[] args) {
        new winduckw2();
    }
    
}

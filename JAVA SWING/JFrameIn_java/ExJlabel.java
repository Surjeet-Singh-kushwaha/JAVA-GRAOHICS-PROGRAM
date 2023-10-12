package JFrameIn_java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class ExJlabel extends Frame implements ActionListener {
    public static void main(String[] args) {
    
    JFrame frame=new JFrame("Login Page");
     JLabel l1 =new JLabel("Email");
     l1.setBounds(200, 200, 75, 30);
     JTextField tf1 =new JTextField();
     tf1.setBounds(300,200,250,30);

    JLabel l2 =new JLabel("Password");
    l2.setBounds(200, 275, 75, 30);
     JTextField tf2 =new JTextField();
     tf2.setBounds(300, 275, 250, 30);
    JButton button1=new JButton("Login",new ImageIcon("Login.png"));
    button1.setBounds(300, 350,100,25 );
    JButton button2=new JButton("cancel",new ImageIcon("x.png"));
    button2.setBounds(450, 350, 100, 25);
   
   frame.add(l1);frame.add(l2);frame.add(tf1);frame.add(tf2);frame.add(button1);frame.add(button2);
    frame.setSize(400,400);  
        frame.setLayout(null);  
        frame.setVisible(true);  

}
}
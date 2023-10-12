package JFrameIn_java;
import java.awt.* ;

import javax.swing.*;

public class FrameEx {
    public static void main(String[] args) {
        JFrame j= new JFrame("This is my first JFrame");
        
        JButton b1=new JButton();
        b1.setBounds(50,50, 20, 10);
      
        j.setSize(450,500);
        
         j.setBackground(Color.BLUE);
           j.add(b1);
       j.setVisible(true);
   // j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

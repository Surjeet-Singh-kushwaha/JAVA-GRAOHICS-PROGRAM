import javax.swing.*;
import java.util.Random;
import java.awt.*;
public class ScreenSvaver extends Panel {
    public void paint(Graphics g){
        clearScreen();
        Random ran=new Random();
       
             for(int i=0;i<300;i++){
            int X = ran.nextInt(1400);
        int y=ran.nextInt(800);
        int width=100;
        Color col =ran.
        g.setColor(color.r);
        
            g.fillOval(X, y, width, width);
            try{
                Thread.sleep(50); }
              catch(Exception e){}
        }
       // g.clearRect(0,0, 1300, 800);
        
       

    }
    public static void main(String[] args) {
        JFrame j=new JFrame("Use Of Random");
        ScreenSvaver s=new ScreenSvaver();
        j.add(s);
        j.setBackground(Color.BLACK);
        j.setExtendedState(JFrame.MAXIMIZED_BOTH);
        j.setVisible(true);
        
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;

public class Car extends JPanel {
    @Override
    public void paint(Graphics g) {
        
        

        super.paint(g);
        g.setColor(Color.MAGENTA);
        // g.fillRect(150, 100,550, 150);
        g.drawLine(100, 300, 150, 300);
        // Drawing first tire
        g.drawArc(150, 275, 50, 50, 0, 180);

        g.setColor(Color.BLACK);
        g.drawOval(155, 280, 40, 40);
        // rim connector
        g.drawOval(170, 295, 10, 10);
        g.setColor(Color.MAGENTA);
        // body
        g.drawLine(200, 300, 350, 300);
        // Second tire
      
        g.drawArc(350, 275, 50, 50, 0, 180);
        // g.setColor(Color.BLACK);
        g.setColor(Color.BLACK);
        g.drawOval(355, 280, 40, 40);
        // rim connector
        g.drawOval(370, 295, 10, 10);

        g.setColor(Color.MAGENTA);
        g.drawLine(400, 300, 450, 300);
  try{
         Thread.sleep(5);
        }
        catch(Exception e){}
        // g.drawOval(500, 270, 200, 100);
        g.drawArc(400, 250, 50, 100, 0, 90);
        // UpperLine
        g.drawLine(425, 250, 150, 250);
        g.drawArc(100, 250, 100, 100, 90, 90);
        // for door
        g.drawArc(150, 220, 250, 60, 0, 180);
        g.drawLine(275, 220, 275, 250);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MOVING CAR");
        Car panel = new Car();
        frame.add(panel);
        frame.setSize(800, 400);

        // frame.setDeafultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

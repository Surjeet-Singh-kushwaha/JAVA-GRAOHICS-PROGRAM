import javax.swing.*;
import java.awt.*;


public class Face extends Panel {
     public void paint(Graphics g){
     super.paint(g);
   
      g.drawOval(40, 40, 120,150);
      try{
        Thread.sleep(500);

      }
      catch(Exception e){}
      g.drawOval(57,75,30,20);
       try{
        Thread.sleep(500);}
      catch(Exception e){}
      g.drawOval(110,75,30,20); 
      try{
        Thread.sleep(500); }
      catch(Exception e){}

        g.drawOval(68,81,10,10);
        try{
        Thread.sleep(500); }
      catch(Exception e){}
        g.fillOval(68,81,10,10);
        try{
        Thread.sleep(500); }
      catch(Exception e){}
        g.fillOval(121,81,10,10);
        try{
        Thread.sleep(500); }
      catch(Exception e){}
        g.drawOval(85,100,30,30);
        try{
        Thread.sleep(500); }
      catch(Exception e){}
        g.fillArc(60,125,80,40,180,180);
        try{
        Thread.sleep(500); }
      catch(Exception e){}
        g.drawOval(25,92,15,30);
        try{
        Thread.sleep(500); }
      catch(Exception e){}
        g.drawOval(160,92,15,30);
    }

   
/**
 * @param args
 */
public static void main(String[] args) {
      JFrame frame =new JFrame();
    Face face = new Face();
      JButton button=new JButton("Graph");
     // butto1.setLocation(500, 200);
     frame.add(face);
    // frame.add(button);
 
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
}
}

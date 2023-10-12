
import javax.swing.*;
import java.awt.*;

public class DrawGraph extends Panel {
    public void paint(Graphics g){
     int X[]={0,60,120,180,240,300,360,400};
     int Y[]={400,280,200,140,60,60,100,220};
     int n=X.length;
     for(int i=0;i<n;i++){
        if(i==n-1){
            g.drawLine(X[0],Y[0],X[i],Y[i]);
            return;
        }
        g.drawLine(X[i],Y[i],X[i+1],Y[i+1]);
        try{
            Thread.sleep(500);
        }
        catch(Exception e){}
     }
     
        }
    public static void main(String[] args) {
        JFrame frame=new JFrame("Graph");
        DrawGraph graph =new DrawGraph();
        frame.add(graph);
        frame.setSize(600, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

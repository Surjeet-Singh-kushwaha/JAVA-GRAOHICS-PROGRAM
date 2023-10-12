import javax.swing.*;
import java.awt.*;

public class Graphicss extends JPanel {
    // Your code for drawing lines and rectangles goes here
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(100, 200, 300, 200);

        // To draw rectangles, you can use the drawRect method
        g.drawRect(50, 50, 100, 100);
        g.fillArc(300, 300, 100, 100, 0, 90);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Line and Rectangle Drawing");
        Graphicss panel = new Graphicss(); // Use the correct class name
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

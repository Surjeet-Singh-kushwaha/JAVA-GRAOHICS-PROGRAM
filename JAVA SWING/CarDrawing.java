import java.awt.*;
import javax.swing.*;

public class CarDrawing extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Car Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new CarDrawing());
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set background color
        setBackground(Color.BLACK);

        // Create a Graphics2D object for advanced drawing
        Graphics2D g2d = (Graphics2D) g;

        // Set drawing color to white
        g2d.setColor(Color.WHITE);

        // Draw the road
       //g2d.drawLine(50, 300, 300, 300);

        // Draw the car body
        g2d.setColor(Color.RED);
        g2d.fillArc(50, 315, 10, 20, 0, 180);
        g2d.fillRect(50, 300, 225, 45);

        // Draw the first tire
        g2d.setColor(Color.BLUE);
        g2d.drawArc(75, 325, 40, 40, 0, 180);
        g2d.fillArc(75, 325, 10, 10, 0, 180);
        //tire
        g2d.drawArc(75, 325, 15, 8, 0, 360);

        // Draw the second tire
        g2d.drawArc(175, 325, 40, 40, 0, 180);
        g2d.fillArc(175, 325, 10, 10, 0, 360);

        // Draw the upper body
        g2d.setColor(Color.LIGHT_GRAY);
        int[] xPoints = {100, 200, 240, 70};
        int[] yPoints = {260, 260, 300, 300};
        g2d.fillPolygon(xPoints, yPoints, 4);

        // Draw the window
        g2d.setColor(Color.CYAN);
        g2d.drawLine(150, 260, 150, 300);
        //g2d.drawLine(150, 260, 100, 315);
        //g2d.drawLine(100, 315, 235, 315);

        // Draw the name
        // g2d.setColor(Color.WHITE);
        // g2d.drawString("SURJEET SINGH", 115, 308);
    }
}

import javax.swing.*;
import java.awt.*;
public class WindowFrameGraphicsExample {
    public static void main(String[] args) {
        System.out.println("HITESHI JOSHI");
        System.out.println("17032249057");
        System.out.println(" usage of window frames and graphics");
        System.out.println("----------------------- ---------");
        // Create the JFrame (window)
        JFrame frame = new JFrame("Window Frame with Graphics");
        
        // Set the size of the window
        frame.setSize(600, 600);

        // Add the custom drawing panel to the window
        frame.add(new DrawPanel());

        // Set the default close operation to exit the application when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the window visible
        frame.setVisible(true);
    }
}

// Custom panel class that will handle the drawing of shapes
class DrawPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Call the superclass's paintComponent method

        // Set color for drawing
        g.setColor(Color.RED);
        // Draw a filled rectangle
        g.fillRect(50, 50, 200, 100);
        // Set color for drawing a different shape
        g.setColor(Color.BLUE);
        // Draw an oval
        g.fillOval(300, 50, 200, 100);
        // Set color for drawing a line
        g.setColor(Color.GREEN);
        // Draw a line
        g.drawLine(50, 200, 500, 200);
        // Set color for drawing another shape
        g.setColor(Color.YELLOW);
        // Draw a polygon (triangle)
        int[] xPoints = {150, 250, 350};
        int[] yPoints = {300, 400, 300};
        g.fillPolygon(xPoints, yPoints, 3);
    }
} 

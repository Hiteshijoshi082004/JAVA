import javax.swing.*;
import java.awt.*;
public class ShapeApplet extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw a red rectangle
        g.setColor(Color.RED);
        g.fillRect(50, 50, 150, 100);
        // Draw a green oval
        g.setColor(Color.GREEN);
        g.fillOval(250, 50, 150, 100);
        // Draw a blue circle
        g.setColor(Color.BLUE);
        g.fillOval(100, 200, 100, 100);
        // Draw a yellow line
        g.setColor(Color.YELLOW);
        g.drawLine(50, 300, 400, 300);
        // Draw a black triangle
        g.setColor(Color.BLACK);
        int[] xPoints = {250, 350, 300};
        int[] yPoints = {400, 400, 300};
        g.fillPolygon(xPoints, yPoints, 3);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shape Drawing");
        ShapeApplet panel = new ShapeApplet();
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

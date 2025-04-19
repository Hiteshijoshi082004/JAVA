 import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandling {

    public static void main(String[] args) {
        System.out.println("HITESHI JOSHI");
        System.out.println("17032249057");
        System.out.println("Event Handling in java");
        System.out.println("-------------------------------------------------");
        // Create a JFrame (window)
        JFrame frame = new JFrame("Event Handling Demo");

        // Create a button
        JButton button = new JButton("Click Me");

        // Set the button's position and size
        button.setBounds(100, 100, 150, 40);

        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This block of code is executed when the button is clicked
                JOptionPane.showMessageDialog(frame, "Button was clicked!", "Event Triggered", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Set up the frame (window) size, layout, and default close operation
        frame.setSize(400, 400);
        frame.setLayout(null);  // Use null layout for absolute positioning
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the button to the frame
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);
    }
}
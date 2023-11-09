import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectanglePerimeterGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Create the main frame
        JFrame frame = new JFrame("Rectangle Perimeter Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and set up the input fields
        JTextField lengthField = new JTextField(10);
        JTextField widthField = new JTextField(10);

        // Create and set up the "Calculate Perimeter" button
        JButton calculateButton = new JButton("Calculate Perimeter");

        // Create and set up the output field
        JTextField perimeterField = new JTextField(10);
        perimeterField.setEditable(false); // Make it read-only

        // Add action listener to the "Calculate Perimeter" button
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double length = Double.parseDouble(lengthField.getText());
                    double width = Double.parseDouble(widthField.getText());
                    double perimeter = 2 * (length + width);
                    perimeterField.setText(Double.toString(perimeter));
                } catch (NumberFormatException ex) {
                    perimeterField.setText("Invalid input");
                }
            }
        });

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.add(new JLabel("Length: "));
        panel.add(lengthField);
        panel.add(new JLabel("Width: "));
        panel.add(widthField);
        panel.add(calculateButton);
        panel.add(new JLabel("Perimeter: "));
        panel.add(perimeterField);

        // Add the panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.pack();
        frame.setVisible(true);
    }
}
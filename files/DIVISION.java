import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisionGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Create the main frame
        JFrame frame = new JFrame("Division GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create and set up the input fields
        JTextField number1Field = new JTextField(10);
        JTextField number2Field = new JTextField(10);
        
        // Create and set up the "Divide" button
        JButton divideButton = new JButton("Divide");
        
        // Create and set up the output field
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false); // Make it read-only
        
        // Add action listener to the "Divide" button
        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(number1Field.getText());
                    double num2 = Double.parseDouble(number2Field.getText());
                    if (num2 != 0) {
                        double quotient = num1 / num2;
                        resultField.setText(Double.toString(quotient));
                    } else {
                        resultField.setText("Division by zero");
                    }
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });
        
        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.add(new JLabel("Dividend: "));
        panel.add(number1Field);
        panel.add(new JLabel("Divisor: "));
        panel.add(number2Field);
        panel.add(divideButton);
        panel.add(new JLabel("Result: "));
        panel.add(resultField);
        
        // Add the panel to the frame
        frame.add(panel);
        
        // Set frame properties
        frame.pack();
        frame.setVisible(true);
    }
}

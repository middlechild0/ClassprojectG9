import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Create the main frame
        JFrame frame = new JFrame("Addition GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create and set up the input fields
        JTextField number1Field = new JTextField(10);
        JTextField number2Field = new JTextField(10);
        
        // Create and set up the "Add" button
        JButton addButton = new JButton("Add");
        
        // Create and set up the output field
        JTextField resultField = new JTextField(10);
        resultField.setEditable false);
        
        // Add action listener to the "Add" button
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(number1Field.getText());
                    int num2 = Integer.parseInt(number2Field.getText());
                    int sum = num1 + num2;
                    resultField.setText(Integer.toString(sum));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });
        
        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.add(new JLabel("Number 1: "));
        panel.add(number1Field);
        panel.add(new JLabel("Number 2: "));
        panel.add(number2Field);
        panel.add(addButton);
        panel.add(new JLabel("Result: "));
        panel.add(resultField);
        
        // Add the panel to the frame
        frame.add(panel);
        
        // Set frame properties
        frame.pack();
        frame.setVisible(true);
    }
}

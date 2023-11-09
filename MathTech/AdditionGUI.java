package MathTech; 

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionGUI {
    public static void run() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        
        JFrame frame = new JFrame("Addition GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        JTextField number1Field = new JTextField(10);
        JTextField number2Field = new JTextField(10);

        
        JButton addButton = new JButton("Add");

        
        JTextField resultField = new JTextField(10);
        resultField.setEditable(true); 

        
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

        
        JPanel panel = new JPanel();
        panel.add(new JLabel("Number 1: "));
        panel.add(number1Field);
        panel.add(new JLabel("Number 2: "));
        panel.add(number2Field);
        panel.add(addButton);
        panel.add(new JLabel("Result: "));
        panel.add(resultField);

        
        frame.add(panel);

        
        frame.pack();
        frame.setVisible(true);
    }
}

package MathTech;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisionGUI {
    public static void run() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Division GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField number1Field = new JTextField(10);
        JTextField number2Field = new JTextField(10);

        JButton divideButton = new JButton("Divide");

        JTextField resultField = new JTextField(10);
        resultField.setEditable(true);

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

        JPanel panel = new JPanel();
        panel.add(new JLabel("Dividend: "));
        panel.add(number1Field);
        panel.add(new JLabel("Divisor: "));
        panel.add(number2Field);
        panel.add(divideButton);
        panel.add(new JLabel("Result: "));
        panel.add(resultField);

        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}

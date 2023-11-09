package MathTech;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircleAreaGUI {
    public static void run() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Circle Area Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField radiusField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate Area");
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double radius = Double.parseDouble(radiusField.getText());
                    double area = Math.PI * radius * radius;
                    resultField.setText(String.format("%.2f", area));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Radius: "));
        panel.add(radiusField);
        panel.add(calculateButton);
        panel.add(new JLabel("Area: "));
        panel.add(resultField);

        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}

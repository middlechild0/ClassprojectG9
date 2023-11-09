package MathTech;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CirclePerimeterGUI {
    public static void run() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Circle Perimeter Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField radiusField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate Perimeter");
        JTextField resultField = new JTextField(10);
        resultField.setEditable(true);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double radius = Double.parseDouble(radiusField.getText());
                    double perimeter = 2 * Math.PI * radius;
                    resultField.setText(Double.toString(perimeter));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Radius: "));
        panel.add(radiusField);
        panel.add(calculateButton);
        panel.add(new JLabel("Perimeter: "));
        panel.add(resultField);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

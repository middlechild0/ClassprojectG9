package MathTech;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrianglePerimeterGUI {
    public static void createAndShowGUI() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }

    private static void createGUI() {
        JFrame frame = new JFrame("Triangle Perimeter Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField side1Field = new JTextField(10);
        JTextField side2Field = new JTextField(10);
        JTextField side3Field = new JTextField(10);

        JButton calculateButton = new JButton("Calculate Perimeter");

        JTextField perimeterField = new JTextField(10);
        perimeterField.setEditable(false);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double side1 = Double.parseDouble(side1Field.getText());
                    double side2 = Double.parseDouble(side2Field.getText());
                    double side3 = Double.parseDouble(side3Field.getText());
                    double perimeter = side1 + side2 + side3;
                    perimeterField.setText(Double.toString(perimeter));
                } catch (NumberFormatException ex) {
                    perimeterField.setText("Invalid input");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Side 1: "));
        panel.add(side1Field);
        panel.add(new JLabel("Side 2: "));
        panel.add(side2Field);
        panel.add(new JLabel("Side 3: "));
        panel.add(side3Field);
        panel.add(calculateButton);
        panel.add(new JLabel("Perimeter: "));
        panel.add(perimeterField);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

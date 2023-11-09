package MathTech;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectanglePerimeterGUI {
    public static void run() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        
        JFrame frame = new JFrame("Rectangle Perimeter Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JTextField lengthField = new JTextField(10);
        JTextField widthField = new JTextField(10);

        
        JButton calculateButton = new JButton("Calculate Perimeter");

        
        JTextField perimeterField = new JTextField(10);
        perimeterField.setEditable(false); // Make it read-only

        
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

        
        JPanel panel = new JPanel();
        panel.add(new JLabel("Length: "));
        panel.add(lengthField);
        panel.add(new JLabel("Width: "));
        panel.add(widthField);
        panel.add(calculateButton);
        panel.add(new JLabel("Perimeter: "));
        panel.add(perimeterField);

        
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

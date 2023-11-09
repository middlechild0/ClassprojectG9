package MathTech;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectangleAreaGUI {
    public static void run() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        
        JFrame frame = new JFrame("Rectangle Area Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JTextField lengthField = new JTextField(10);
        JTextField widthField = new JTextField(10);

        
        JButton calculateButton = new JButton("Calculate Area");

        
        JTextField areaField = new JTextField(10);
        areaField.setEditable(false); 
        
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double length = Double.parseDouble(lengthField.getText());
                    double width = Double.parseDouble(widthField.getText());
                    double area = length * width;
                    areaField.setText(Double.toString(area));
                } catch (NumberFormatException ex) {
                    areaField.setText("Invalid input");
                }
            }
        });

        Panel panel = new JPanel();
        panel.add(new JLabel("Length: "));
        panel.add(lengthField);
        panel.add(new JLabel("Width: "));
        panel.add(widthField);
        panel.add(calculateButton);
        panel.add(new JLabel("Area: "));
        panel.add(areaField);

        
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

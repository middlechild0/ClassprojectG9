import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        
        JFrame frame = new JFrame("Triangle Area Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JTextField baseField = new JTextField(10);
        JTextField heightField = new JTextField(10);

        
        JButton calculateButton = new JButton("Calculate Area");

        
        JTextField areaField = new JTextField(10);
        areaField.setEditable(false); // Make it read-only

        
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double base = Double.parseDouble(baseField.getText());
                    double height = Double.parseDouble(heightField.getText());
                    double area = 0.5 * base * height;
                    areaField.setText(Double.toString(area));
                } catch (NumberFormatException ex) {
                    areaField.setText("Invalid input");
                }
            }
        });

        
        JPanel panel = new JPanel();
        panel.add(new JLabel("Base: "));
        panel.add(baseField);
        panel.add(new JLabel("Height: "));
        panel.add(heightField);
        panel.add(calculateButton);
        panel.add(new JLabel("Area: "));
        panel.add(areaField);

       
        frame.add(panel);

        
        frame.pack();
        frame.setVisible(true);
    }
}

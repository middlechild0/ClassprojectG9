import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner; // Added the import for Scanner

class AdditionGUI {
    public static void main(String[] args) {
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
        resultField.setEditable(false); 

        
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

class SubtractionGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        
        JFrame frame = new JFrame("Subtraction GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JTextField number1Field = new JTextField(10);
        JTextField number2Field = new JTextField(10);

        
        JButton subtractButton = new JButton("Subtract");

        
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false);
        
        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(number1Field.getText());
                    int num2 = Integer.parseInt(number2Field.getText());
                    int difference = num1 - num2;
                    resultField.setText(Integer.toString(difference));
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
        panel.add(subtractButton);
        panel.add(new JLabel("Result: "));
        panel.add(resultField);

        
        frame.add(panel);

        
        frame.pack();
        frame.setVisible(true);
    }
}
public class MultiplicationGUI {
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
                        double quotient = num1 * num2;
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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
           
            System.out.println("9. Exit");

            int choice = scanner.nextInt();

            if (choice == 9) {
                break;
            }

            switch (choice) {
                case 1:
                    Addition se = new Addition();
                    System.out.print("Enter the first number: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Result: " + se.add(num1, num2));
                    break;
                case 2:
                    subtraction sb = new subtraction();
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextInt();
                    System.out.println("Result: " + sb.subtraction(num1, num2));
                    break;
                
                case 3:
                    multiplication mp = new multiplication();
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextInt();
                    System.out.println("Result: " + mp.multiplication(num1, num2));
                    break;
                
                case 4:
                    division dv = new division();
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextInt();
                    System.out.println("Result: " + dv.division(num1, num2));
                    break;

                // Add cases for other operations here
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}


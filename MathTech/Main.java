package MathTech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Calculate Circle Perimeter");
            System.out.println("6. Calculate Circle Area");
            System.out.println("7. Calculate Triangle Area");
            System.out.println("8. Exit");

            int choice = scanner.nextInt();

            if (choice == 8) {
                break;
            }

            switch (choice) {
                case 1:
                    AdditionGUI.run();
                    break;
                case 2:
                    SubtractionGUI.run();
                    break;
                case 3:
                    MultiplicationGUI.run();
                    break;
                case 4:
                    DivisionGUI.run();
                    break;
                case 5:
                    // Add code to calculate the circle perimeter here
                    break;
                case 6:
                    // Add code to calculate the circle area here
                    break;
                case 7:
                    // Add code to calculate the triangle area here
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

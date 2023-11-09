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
            System.out.println("7. Calculate Rectangle Perimeter");
            System.out.println("8. Calculate Rectangle Area");
            System.out.println("9. Exit");

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
                    CirclePerimeterGUI.run();
                    break;
                case 6:
                    CircleAreaGUI.run();
                    break;
                case 7:
                    RectanglePerimeterGUI.run();
                    break;
                case 8:
                    RectangleAreaGUI.run();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

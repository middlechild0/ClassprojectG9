package calculator;
import java.util.Scanner;
class Addition {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

class subtraction {
	int i;
	int j;
	int sub;
	public int subtraction(int i,int j)
	{
		sub = i-j;
		return sub;
	}
}

class Multiplication {
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
}

class Division {
    public double divide(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Rectangle Perimeter");
            System.out.println("6. Triangle Area");
            System.out.println("7. Circle Area");
            System.out.println("8. Circle Perimeter");
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
                	subtraction sb =new subtraction();
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextInt();
                    System.out.println("Result is :;"+ sb);
                    System.out.println("Result: " + sb.subtraction(num1, num2));
                    break;
                case 3:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextInt();
                    System.out.println("Result: " + Multiplication.multiply(num1, num2));
                    break;
                case 4:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextInt();
                    System.out.println("Result: " + Division.divide(num1, num2));
                    break;
                case 5:
                    System.out.print("Enter the length: ");
                    int length = scanner.nextInt();
                    System.out.print("Enter the width: ");
                    int width = scanner.nextInt();
                    System.out.println("Perimeter: " + RectanglePerimeter.calculatePerimeter(length, width));
                    break;
                case 6:
                    System.out.print("Enter the base: ");
                    int base = scanner.nextInt();
                    System.out.print("Enter the perpendicular height: ");
                    int height = scanner.nextInt();
                    System.out.println("Area: " + TriangleArea.calculateArea(base, height));
                    break;
                case 7:
                    System.out.print("Enter the radius: ");
                    int radius = scanner.nextInt();
                    System.out.println("Area: " + CircleArea.calculateArea(radius));
                    break;
                case 8:
                    System.out.print("Enter the radius: ");
                    radius = scanner.nextInt();
                    System.out.println("Perimeter: " + CirclePerimeter.calculatePerimeter(radius));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

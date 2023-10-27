import java.util.Scanner;

class ATM {
    private double balance;
    String name;

    public ATM(double initialBalance) {
        balance = initialBalance;
    }

    public void getBalance() {
        System.out.println("The balance is\t" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your initial balance: $");
        double amount = scanner.nextDouble();
        ATM my = new ATM(amount);
        System.out.println(my.balance);
        my.getBalance();
        scanner.close();
    }
}

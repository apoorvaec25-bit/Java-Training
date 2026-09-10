import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();

        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. Balance Check");

        System.out.print("Choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Deposit amount: ");
                double deposit = sc.nextDouble();

                if (deposit > 0) {
                    balance = balance + deposit;
                    System.out.println("Updated balance: " + balance);
                } else {
                    System.out.println("Invalid deposit amount.");
                }
                break;

            case 2:
                System.out.print("Withdrawal amount: ");
                double withdrawal = sc.nextDouble();

                if (withdrawal > 0 && withdrawal <= balance) {
                    balance = balance - withdrawal;
                    System.out.println("Updated balance: " + balance);
                } else {
                    System.out.println("Invalid withdrawal or insufficient balance.");
                }
                break;

            case 3:
                System.out.println("Current balance: " + balance);
                break;

            default:
                System.out.println("Invalid menu choice.");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        if (n > 0) {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }

            System.out.println("Sum: " + sum);
        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}

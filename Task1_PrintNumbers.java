import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Word: One");
                break;
            case 2:
                System.out.println("Word: Two");
                break;
            case 3:
                System.out.println("Word: Three");
                break;
            case 4:
                System.out.println("Word: Four");
                break;
            case 5:
                System.out.println("Word: Five");
                break;
            default:
                System.out.println("Invalid number. Please enter a number from 1 to 5.");
        }

        sc.close();
    }
}

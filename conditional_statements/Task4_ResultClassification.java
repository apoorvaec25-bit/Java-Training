import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Please enter marks between 0 and 100.");
        } 
        else if (marks < 35) {
            System.out.println("Result: Fail");
        } 
        else if (marks <= 59) {
            System.out.println("Result: Pass");
        } 
        else if (marks <= 69) {
            System.out.println("Result: Second Class");
        } 
        else if (marks <= 89) {
            System.out.println("Result: First Class");
        } 
        else {
            System.out.println("Result: Highest Grade");
        }

        sc.close();
    }
}

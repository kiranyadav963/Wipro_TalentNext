import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int next;
        Scanner sc = new Scanner(System.in); // Fixed: System.in should be capitalized
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println("the series is:");
        for(int i = 0; i < n; i++) {
            System.out.print(first + " "); // Print the current Fibonacci number
            next = first + second;
            first = second;
            second = next;
        }
    }
}

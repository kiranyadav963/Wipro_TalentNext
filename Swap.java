//swapping two numbers without using third variable

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a  = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        System.out.println("values before swapping: "+a+" "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.err.println("values after swapping: " + a +" " + b);
        
    }
}

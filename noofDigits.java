import java.util.Scanner;
public class noofDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int number = in.nextInt();
        int count = 0;
        while(number > 0){
            count++;
            number = number/10;
        }
        System.out.println("no of diguts in given number is : " + count);
    }
}

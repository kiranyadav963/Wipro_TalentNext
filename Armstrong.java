import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number:");
        int number = sc.nextInt();
        //count the number of digits
        int original = number;
        int n =0;
        while(number>0){
            number /= 10;
            n++;

        }
         //calculate the power sum
         int sum = 0;
         number = original;
         while(number>0){
            int digit = number % 10;
            sum += Math.pow(digit, n);
            number /= 10;
         }
    
        //check if the sum equals the original number
        if(original == sum) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
    }


}

import java.util.25;
public class sumDigits {
    public static int digitSum(int num){
        int sum = 0;
        while(num !=0){
            int digit = num % 10;
            sum += digit;
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int number = in.nextInt();
        int result = digitSum(number);
        System.out.println("the sum of the digits is : "+ result);
    }
    
}

import java.util.Scanner;
public class Factorial {
    public static int factorial(int n){
        int fact = 1;
        if(n==0 || n==1){
            return fact;
        }else{
            while(n>1){
                fact *= n;
                n--;
            }

        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to calculate factorial");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("factorilial is : " + result);
    }
    
}

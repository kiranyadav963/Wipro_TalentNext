import java.util.Scanner;
public class palindrome {
    public static boolean checkPalindrome(int n){
        int original = n;
        int rev = 0;
        while(n>0){
            int ld = n % 10;
            rev = rev*10 + ld;
            n = n/10;
        }
        if(rev == original){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to check for palindrome");
        int number = in.nextInt();
        boolean ans = checkPalindrome(number);
        if(ans){
            System.out.println("palindrome");
        }else{
            System.out.println("mot a palindrome");
        }

    }
    
}

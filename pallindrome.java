import java.util.Scanner;

public class Palindrome{
    int n, result = 0;


    int checkPalindrome(int n) {
        if (n <= 0) {
            return result;
        } else {
            sum = (sum * 10) + n % 10;
            return checkPalindrome(n / 10);
        }


    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int temp=n;

        Palindrome p =new Palindrome();
        p.checkPalindrome(n);
        if(p.result == temp){
            System.out.println(temp+" is apalindrome");

        }
        else{
            System.out.println(temp+" is not a palindrome");
        }


    }
}

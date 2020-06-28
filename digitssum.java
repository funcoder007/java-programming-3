import java.util.Scanner;
public class DigitSum {
    int n,sum = 0;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = s.nextInt();
        DigitSum ds= new DigitSum();
        System.out.println("Sum:" +ds.add(n));
    }

    int add(int n) {
        sum = n % 10;
        if (n == 0) {
            return 0;
        } else {
            return sum + add(n/10);
        }

    }
}

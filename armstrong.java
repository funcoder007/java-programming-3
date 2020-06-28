import java.util.Scanner;
public class Armstrong
{
    Scanner sc= new Scanner(System.in);
    int num, temp, rem, result = 0;

    public void getData()
    {
        System.out.print("Enter any number:");
        num=sc.nextInt();
        System.out.print("Number of digits you entered:");
        n=sc.nextInt();
        temp = num;
    }

    public void checkData()
    {
        while(temp != 0)
        {
            rem = temp % 10;
            result += Math.pow(rem, n);
            temp /=10;
        }
        if(result == num)
        {
            System.out.println(num +" is an armstrong number.");
        }
        else
        {
            System.out.println(num +" is not an armstrong number.");
        }
    }
    public static void main(String[] args)
    {
        Armstrong an=new Armstrong()r();
        an.getData();
        an.checkData();
    }
}

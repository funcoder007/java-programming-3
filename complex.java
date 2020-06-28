import java.util.Scanner;
public class Complex
{
    Scanner sc= new Scanner(System.in);
    double r1, r2, img1, img2, sumr, sumimg, diffr, diffimg, mulr, mulimg;

    public void getData()
    {
        System.out.print("Enter real part of 1st Complex Number:");
        r1=sc.nextInt();
        System.out.print("Enter imaginary part of 1st Complex Number:");
        img1=sc.nextInt();
        System.out.print("Enter real part of 2nd Complex Number:");
        r2=sc.nextInt();
        System.out.print("Enter imaginary part of 2nd Complex Number:");
        img2=sc.nextInt();
    }

    public void sum()
    {
        sumr = r1+r2;
        sumimg = img1+img2;
        System.out.println("sum of the complex numbers:"+sumr+"+"+sumimg+"i");
    }
    public void diff()
    {
        diffr=r1-r2;
        diffimg=img1-img2;
        System.out.println("difference of complex numbers:"+diffr+"+(" +diffimg+")i");
    }
    public void mul(){
        mulr=(r1*r2)-(img1*img2);
        mulimg=(r1*img2)+(img1*r2);
        System.out.println("product of complex numbers:"+mulr+"+" +mulimg+"i");
    }
    public static void main(String[] args)
    {
        Complex cn=new Complex();
        cn.getData();
        cn.sum();
        cn.diff();
        cn.mul();
    }
}

import java.util.Scanner;
public class Area
{
    Scanner sc=new Scanner(System.in);
    int length, breadth, area;

    public void setDim()
    {
        System.out.println("Enter the length of the rectangle:");
        length=sc.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        breadth=sc.nextInt();
    }

    public double getArea()
    {
        area= length * breadth;
        System.out.println("area is:"+area);
        return area;

    }
    public static void main(String[] args)
    {
        Area ar= new Area();
        ar.setDim();
        ar.getArea();
    }
}

//Area Of Parallelogram
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("enter the length of side a of parallelogram");
    float a=in.nextFloat();
    System.out.println("Enter the breadth of side b of parallelogram");
    float b=in.nextFloat();
    System.out.println("Enter the acute angle between the side a and side b");
    double angle=Math.toRadians(in.nextFloat());
    double area=a*b*Math.sin(angle);
    System.out.println(area);

        
    }
}

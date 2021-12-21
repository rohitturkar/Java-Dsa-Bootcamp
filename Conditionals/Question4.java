//Area Of Isosceles Triangle
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the height of width of isosceles traingle");
        float b=in.nextFloat();
        System.out.println("Enter the length of two other side of traingle");       
        float a=in.nextFloat();
        double area=(b/2)*Math.sqrt((a*a)-((b*b)/4));
        System.out.println("the area of isoscles traingle is "+area);
    
    }
    
}

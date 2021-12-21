//Area of Rectangle
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the length of rectangle");
        float l=in.nextFloat();
        System.out.println("Enter the width of rectangle");
        float w=in.nextFloat();
        double area=l*w;
        System.out.println("the area of rectangle is" +area);
    }
    
}

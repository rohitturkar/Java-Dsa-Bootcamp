//Perimeter Of Rectangle
import java.util.Scanner;
public class Question11 {
   public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the length of Rectangle");
       float l=in.nextFloat();
       System.out.println("Enter the width of Rectangle");
       float w=in.nextFloat();
       double perimeter=2*(l+w);
       System.out.println(" the perimeter of Rectangle is"+perimeter);

   } 
}

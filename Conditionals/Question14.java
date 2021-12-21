//Volume of cone
import java.util.Scanner;
public class Question14 {
   public static void main(String[] args) {
        Scanner in=new Scanner(System.in) ;
        System.out.println("Enter the height of cone");
        float h=in.nextFloat();
        System.out.println("Enter the radius ");
        float r=in.nextFloat();
        double volume=3.14*(r*r)*(h/3);
        System.out.println("the volume of cone is "+volume);
       } 
}

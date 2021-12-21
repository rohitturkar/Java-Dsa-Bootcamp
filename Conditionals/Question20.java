//calculate the lateral surface area and total surface area of cube.
import java.util.Scanner;
public class Question20 {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the side of cube");
    float a=in.nextFloat();
    float lsa=4*(a*a);
    System.out.println("the lateral surface area of cube is"+lsa);
    float tsa=6*(a*a);
    System.out.println("the total surface area of cube is"+tsa);
} 
}

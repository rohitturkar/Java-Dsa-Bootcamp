//Area Of Equilateral Triangle
import java.util.Scanner;;
public class Question7 {
  public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the length of side of Equilateral traingle");
      float a=in.nextFloat();
      double area=((Math.sqrt(3))/4)*(a*a);
      System.out.println("the area is "+area);
  }
}

import java.util.Scanner;
public class Question19 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the radius of cylinder");
        float r=in.nextFloat();
        System.out.println("Enter the height of cylinder");
        float h=in.nextFloat();
        double csa=2*3.14*r*h;
        System.out.println("the curved surface area of cylinder is"+csa);
    }
}

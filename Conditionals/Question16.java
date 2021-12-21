import java.util.Scanner;
public class Question16 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the radius of cylinder");
        float r=in.nextFloat();
        System.out.println("Enter the height of cylinder");
        float h=in.nextFloat();
        double volume=(3.14*(r*r)*h);
        System.out.println("the volume of cylinder is"+volume);
        }
}

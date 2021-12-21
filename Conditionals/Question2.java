
//Area Of Triangle
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height of traingle");
        float h = in.nextFloat();
        System.out.println("Entre the base width of traingle");
        float w = in.nextFloat();

        double area = (h * w) / 2;
        System.out.println("the Area of trangle is " + area);
    }
}

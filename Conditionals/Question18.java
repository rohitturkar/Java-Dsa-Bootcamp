import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height, width and length of pyramid");
        float h = in.nextFloat();
        float l = in.nextFloat();
        float w = in.nextFloat();
        double volume=(l*w*h)/3;
        System.out.println("The voulme of sphere is"+volume);
    }
}

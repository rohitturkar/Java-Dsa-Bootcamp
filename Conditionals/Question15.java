//volume of prism
import java.util.Scanner;
class Question15{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length of prism");
        float l=in.nextFloat();
        System.out.println("Enter the width of prism");
        float w=in.nextFloat();
        System.out.println("Enter the height of prism");
        float h=in.nextFloat();
        double volume=l*w*h;
        System.out.println("the voulme of prism is"+volume);
    }
}
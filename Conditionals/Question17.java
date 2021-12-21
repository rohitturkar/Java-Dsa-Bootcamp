import java.util.Scanner;
public class Question17 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the radius of sphere");
        float r=in.nextFloat();
        double volume=(4/3)*3.14*(r*r*r);
        System.out.println("the volume of sphere is"+volume);

        }
}

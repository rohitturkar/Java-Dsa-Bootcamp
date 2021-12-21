//Are aof circles
import java.util.Scanner;
class Question8{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int radius=in.nextInt();
        double area=3.14*(radius*radius);
        System.out.println("the Area of the circle is "+area+"sqcm");
    }
}
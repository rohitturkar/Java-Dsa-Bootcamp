import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length of first digonal of rhombus");
        float d1=in.nextFloat();
        System.out.println("Enter the length of second digonal of rhombus");
        float d2=in.nextFloat();
         
        double area=(d1*d2)/2;
        System.out.println("The area of rhombus is "+area);
    }
    
}

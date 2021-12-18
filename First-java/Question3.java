//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the principal amount");
        float principal=in.nextFloat();
        System.out.println("Enter the timne in year");
        float time=in.nextFloat();
        System.out.println("Enter the rate in percent");
        float rate=in.nextFloat();

        float si=(principal*time*rate)/100;
        System.out.println("the SI is "+si+"rs.");
    }
}

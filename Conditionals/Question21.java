//Fibonacci Series In Java Programs
import java.util.Scanner;
public class Question21 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the nth number");
        int num=in.nextInt();
        int p=0;
        int i=1;
        int count=2;

        while(count<=num){
              int temp=i;
             i=i+p;
              p=temp;
              count++;
        }
        System.out.println(i);
        
    }
}

//Write a program to print whether a number is even or odd, also take input.
import java.util.Scanner;
class even_odd{
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
   System.out.println("Enter the number");
   int num=in.nextInt();
   if(num%2==0){
       System.out.println("the number is Even");
   }
   else{
       System.out.println("the number is Odd");
   }

    }
}
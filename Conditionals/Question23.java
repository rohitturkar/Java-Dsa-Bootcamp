import java.util.Scanner;

class Question23{
    public static void main(String[] args) {
        int fact=1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int number =in.nextInt();
        for (int i = 5; i >=number; i--) {
            fact=fact*i;
            
        }
        System.out.println("the factorial is"+fact);

    }
}
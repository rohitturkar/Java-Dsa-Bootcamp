import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int product = 1;
        int add = 0;
        int temp;

        while (num > 0) {
            temp = num % 10;
            product = product * temp;
            add = add + temp;
            num=num/10;
        }
        System.out.println("The product of number is" + (product-add));
       
    }
}

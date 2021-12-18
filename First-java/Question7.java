
//To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;

class Question7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth number ");
        int n = in.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;
        while (count <= n) {
            int temp = i;
            i = i + p;
            p = temp;
            count++;
        }
        System.out.println(i);
    }
}

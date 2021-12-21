import java.util.Scanner;
class Question24{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int sum=0;
        int num;
        do{
           num=in.nextInt();
          sum=sum+num;
        }while(num !=0);
        System.out.println("the sum is "+sum);
    }
}
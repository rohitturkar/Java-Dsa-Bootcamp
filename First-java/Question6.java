
//Input currency in rupees and output in USD.
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class Question6 {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the currency in ruppess");
       float currency=in.nextFloat();
       double cindollar=(currency*76.31);
       System.out.println("the currency in Usd is "+cindollar+" USD");

        }
    
}

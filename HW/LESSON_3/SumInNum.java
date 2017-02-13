/**
 * Created by admin on 13.02.2017.
 */
import java.util.Scanner;

public class SumInNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Input Intager Value: ");
        String nUmberString = scan.next();
        int sUmNumOfSting = 0;
        for (int i = (nUmberString.length()- 1); i>=0; i--){
            sUmNumOfSting = sUmNumOfSting + Character.getNumericValue(nUmberString.charAt(i));
        }
        System.out.print("Sum is: "+sUmNumOfSting);
    }
}

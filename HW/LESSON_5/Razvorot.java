/**
 * Created by admin on 13.02.2017.
 */
import java.math.BigDecimal;
import java.util.Scanner;

public class Razvorot {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int xNumber = scan.nextInt();
        System.out.println(reverce(xNumber));
    }

    public static String reverce(int n) {
        if (n < 10) {
            return Integer.toString(n);
        }
        else {
            return n % 10 + reverce(n / 10);
        }
    }
}

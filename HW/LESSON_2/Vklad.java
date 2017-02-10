package LESSON_2;

/**
 * Created by toor on 01.02.17.
 */
import java.math.BigDecimal;
import java.util.Scanner;
public class Vklad {
    public static void main(String[] args) {
        double sumVklada, nakoplenie;
        double percent = 0, years = 0;
        Scanner scanner = new Scanner (System.in);
        System.out.print("Sum: ");
        sumVklada = scanner.nextDouble();
        System.out.print("%: ");
        percent = scanner.nextDouble();
        System.out.print("Years: ");
        years = scanner.nextDouble();
        for (int i=1;i<=years;i++){
            System.out.println("In " + i+ " you have: " + (sumVklada + (sumVklada * percent * i) / 100) + " % is " + (sumVklada * percent * i / 100));
        }


    }
}

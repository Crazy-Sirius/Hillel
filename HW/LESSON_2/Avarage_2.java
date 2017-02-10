package LESSON_2;

/**
 * Created by toor on 01.02.17.
 */
import java.net.SocketPermission;
import java.util.Scanner;
public class Avarage_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = 0;
        double secondNum =0;
        System.out.print("Input first number: ");
        String t = scanner.next();
        while (!isNumber(t)){
            System.out.println("Wrong Value! Please input first number: ");
            t = scanner.next();
        }
        firstNum = Double.parseDouble(t);
        System.out.print("Input second number: ");
        t = scanner.next();
        while (!isNumber(t)){
            System.out.println("Wrong Value! Please input second number: ");
            t = scanner.next();
        }
        secondNum = Double.parseDouble(t);
        System.out.print("Average is: " + ( firstNum + secondNum) / 2 );
    }
    public static boolean isNumber(String str){
        try
        {
            double num = Double.parseDouble(str);
        }
        catch(NumberFormatException e)
        {
            return false;
        }
        return true;

    }
}

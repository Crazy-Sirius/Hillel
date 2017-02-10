package LESSON_2;

/**
 * Created by toor on 01.02.17.
 */
import java.util.Scanner;

public class AverageDifCount {
    public static void main(String[] args) {
        double sum = 0;
        System.out.print("How many numbers? ");
        Scanner scanner = new Scanner(System.in);
        int countNum = scanner.nextInt();

           for (int iterNum=1; iterNum<=countNum;iterNum++){
               System.out.print("Input " + iterNum + " value: ");
               String t = scanner.next();
                 while (!isNumber(t)){
                     System.out.print("Wrong value. Input number: ");
                     t = scanner.next();
                 }
            sum = sum + Double.parseDouble(t);
           }



        System.out.print("Average of " + countNum + " numbers is: " + sum/countNum);
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

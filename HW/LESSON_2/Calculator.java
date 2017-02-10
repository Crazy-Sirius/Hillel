package LESSON_2; /**
 * Created by toor on 29.01.17.
 */
import java.util.Scanner;

public class Calculator {
    public static void main (String[] args){
       Scanner num =  new Scanner(System.in);
       System.out.print("Please input first number:");
       double firstNum = num.nextDouble();
         System.out.println("You input "+firstNum + " as a first number");
       System.out.print("Please input second number:");
       double secondNum = num.nextDouble();
         System.out.println("You input " + secondNum + " as a second number");
       System.out.println("Sum is: " + (firstNum + secondNum));
       System.out.println("Difference is: " + (firstNum - secondNum));
       System.out.println("Multiply is: " + (firstNum * secondNum));
       if (secondNum == 0){
        System.out.println("!!!Division error!!! Second Number is a zero. You can't divide on a zero");
       } else System.out.println("Division is: "+(firstNum / secondNum));
    }
}

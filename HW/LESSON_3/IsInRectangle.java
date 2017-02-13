/**
 * Created by admin on 13.02.2017.
 */
import java.util.Scanner;
public class IsInRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Input top-left X: ");
        double x1 = scan.nextDouble();
        System.out.print("Input top-left Y: ");
        double y1 = scan.nextDouble();
        System.out.print("Input bottom-right X: ");
        double x2 = scan.nextDouble();
        System.out.print("Input bottom-right Y: ");
        double y2 = scan.nextDouble();
        System.out.print("Input M(x,y)  X= ");
        double xM = scan.nextDouble();
        System.out.print("Input M(x,y)  Y= ");
        double yM = scan.nextDouble();
if ((xM >= x1) & (xM <= x2) & (yM <= y1) & (yM >= y2)) {
    System.out.print("Point M("+x1+","+x2+") is in rectangle");
        } else {
    System.out.print("Point M("+x1+","+x2+") is NOT in rectangle");
}

    }

}

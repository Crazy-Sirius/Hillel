/**
 * Created by admin on 13.02.2017.
 */
import java.util.Scanner;

public class Shahmatka {
    public static void main(String[] args) {
        int xCount =0 , yCount = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input X count: ");
        xCount = scan.nextInt();
        System.out.print("Input Y count: ");
        yCount = scan.nextInt();
        for (int yI =1; yI <= yCount; yI++){
            String str = "";
            if (yI % 2 == 0){
                for (int xI = 1; xI <= xCount; xI++) {
                    if (xI % 2 == 0) {
                        str = str + "*";
                    } else str = str + " ";
                }
            }
            if (yI % 2 != 0){
                for (int xI = 1; xI <= xCount; xI++) {
                    if (xI % 2 != 0) {
                        str = str + "*";
                    } else str = str + " ";
                }
            }
            System.out.println(str);
        }
    }
}

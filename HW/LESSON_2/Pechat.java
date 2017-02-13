/**
 * Created by admin on 06.02.2017.
 */
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Scanner;

public class Pechat {
    public static void main(String[] args) {
        int xStart,yStart,xMax,yMax = 0;
        Scanner scanner = new Scanner(System.in);
        xMax = scanner.nextInt();
        yMax = scanner.nextInt();
        float delta = (float) yMax / xMax;
        for (int yI = 0 ; yI <= yMax ; yI++){
            String str ="";
            for (int xI = 0 ; xI <= xMax -1; xI++){

                float err = (yI / delta -xI);

                if ((yI == 0)  | (xI == 0) | (yI == yMax)) {
                    System.out.print("*");
                }

                if ((err < 0.5) & (err >= 0)) {
                    str = str + "*";
                  //  for (int j=1; j< (xMax-2*xI) ;j++){
                  //      str = str+"x ";
                  //  }
                }
                  else
                      if (xI == xMax - 1) {
                        str = str + "*";
                      }
                        else str = str + " ";


            }
            System.out.println(str);



        }
    }
}
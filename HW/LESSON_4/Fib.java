/**
 * Created by admin on 13.02.2017.
 */
import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int xN = scan.nextInt();
        int sUmFib = 0;
        for (int j=1; j<=xN; j++){
            sUmFib = sUmFib + fib(j);
        }
       System.out.print(sUmFib);
    }
    public static int fib(int n){
        if (n <= 0) {return 0;}
          else  if (n ==1) {return 1;}
             else if (n == 2) {return 1;}
              else   return fib (n-1 ) + fib (n - 2);

    }
}


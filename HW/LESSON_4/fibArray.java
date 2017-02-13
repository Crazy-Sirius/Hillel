import java.util.Scanner;

public class fibArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int xN = scan.nextInt();
        int sUmFib = 0;
       // for (int j=1; j<=xN; j++){
       //     sUmFib = sUmFib + fib(j);
      //  }
        System.out.print(fib(xN));
    }
    public static int fib(int n){
        if (n <= 0) {return 0;}
        else  if (n ==1) {return 1;}
        else if (n == 2) {return 1;}
        else   return fib (n-1 ) + fib (n - 2);

    }
}
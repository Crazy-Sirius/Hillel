package LESSON_2;

import java.util.Scanner;

/**
 * Created by toor on 01.02.17.
 */
public class SimpleNumber {
    public static void main(String[] args) {
        System.out.print("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //int k = 11;
        for (int i=3; i <= num-1; i++) {
            if (num % i == 0) {
                System.out.print("NOT Simple");
                return;
            }
        }
        System.out.println("It's simple!");
    }
}

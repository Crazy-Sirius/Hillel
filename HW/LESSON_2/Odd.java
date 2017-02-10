package LESSON_2;

import java.util.Scanner;

/**
 * Created by toor on 01.02.17.
 */
public class Odd {
    public static void main(String[] args) {
        int i=0;
        System.out.print("Input number: ");
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();
        if (i % 2 == 0){
            System.out.print("Number is EVEN");
        } else {
            System.out.print("Number is ODD");
        }
    }
}

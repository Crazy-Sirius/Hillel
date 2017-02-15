/**
 * Created by admin on 15.02.2017.
 */
public class MatricaRnd {

    public static void main(String[] args) {
        int [][] matrix;
        matrix = new int [10][10];
        zapolenieArray(matrix);
        for (int i = 0; i <= 9; i++){
            for (int j = 0; j <= 9; j++){
                System.out.print(matrix[i][j]  + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of Array Elements: "+ summOfArray(matrix));
        System.out.println("Average of array: " + averageNum(matrix));
        System.out.println("MIN element of array: " + minElementOfArray(matrix));
        System.out.println("MAX element of array: " + maxElementOfArray(matrix));
        System.out.println("Number of positive elements in array: " +numberOfPositiveElements (matrix));
    }
   private static int [][] zapolenieArray (int  [][] array){
        for (int i = 0; i <= 9; i++){
            for (int j = 0; j <= 9; j++){
                array[i][j] = (int) (Math.random()*(40+1)) - 20;
            }
        }
        return array;
   }

   private static int summOfArray (int [][] array){
        int sum =0;
        for (int i = 0; i <= 9; i++){
            for (int j = 0; j <= 9; j++){
                sum = array[i][j] + sum;
            }
        }
        return sum;
   }
   private static double averageNum (int [][] array){
       return (double) summOfArray(array) / 100;
   }

   private static int minElementOfArray (int [][] array) {
       int minElement = array [0][0];
       for (int i = 0; i <= 9; i++){
           for (int j = 0; j <= 9; j++){
                if (array [i][j] < minElement){
                    minElement = array [i][j];
                }
           }
       }
       return minElement;

   }
    private static int maxElementOfArray (int [][] array) {
        int maxElement = array[0][0];
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }
        }
        return maxElement;
    }
    private static int numberOfPositiveElements (int [][] array) {
        int numberPositivElements = 0;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if ((array[i][j] > 0) &  (array [i][j] !=0)) {
                    numberPositivElements = numberPositivElements + 1;
                }
            }
        }
        return numberPositivElements;
    }
}

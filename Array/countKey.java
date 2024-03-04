package array2;

import java.util.Scanner;

public class countkey {

    public static int countKey(int matrix[][] , int key) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (key == matrix[i][j]) {
                    count += 1;    //counting the key 
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();   //number of row in matrix
        int n = sc.nextInt();   //number of col in matrix
        int matrix[][] = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                 matrix[i][j] = sc.nextInt();
            }
        }
        int key = sc.nextInt();   // key which will be counted
        System.out.println(countKey(matrix,key));
    }
}

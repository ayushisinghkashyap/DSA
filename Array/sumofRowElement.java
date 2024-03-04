package array2;

import java.util.Scanner;

public class rowElement {

    public static int sumofRowElement(int matrix[][], int rowNum) {
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[rowNum][j];
        }

        return sum;
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
        int rowNum = sc.nextInt();  //row number

        //int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        //int rowNum=1;
        System.out.println(sumofRowElement(matrix, rowNum));
    }
}

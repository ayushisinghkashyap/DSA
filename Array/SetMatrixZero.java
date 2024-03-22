package practice;

public class SetMatrixZero {
    public static void matrix_zero(int matrix[][]){
      //row = matrix.length
      //column = matrix[0].length
        for(int i=0;i< matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < matrix.length; k++) {
                        matrix[k][j] = -1;  //replacing by -1 in jth column
                    }
                    for (int k = 0; k < matrix[0].length; k++) {
                        matrix[i][k] = -1; //replacing by -1 in ith row 
                    }
                }
            }
        }
        for(int i=0;i< matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0; //replacing all -1 by 0 
                }
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][]={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        matrix_zero(matrix);
      //print matrix
        for(int i=0;i< matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");   
            }
            System.out.println();
        }
    }
}

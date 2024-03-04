package array2;

public class spiral_matrix {
    public static void spiral(int matrix[][]) {
        int Startrow = 0;
        int Startcol = 0;
        int Endrow = matrix.length - 1;
        int Endcol = matrix[0].length - 1;
        while (Startrow <= Endrow && Startcol <= endcol) {

            //Top
            for (int i = Startcol; i <= Endcol; i++) {
                System.out.print(matrix[Startrow][i] + " ");
            }

            //right
            for (int j = Startrow + 1; j <= Endrow; j++) {
                System.out.print(matrix[j][endcol] + " ");
            }

            //bottom
            for (int i = Endcol - 1; i >= Startcol; i--) {
                if (Startrow == Endrow) {
                    break;
                }
                System.out.print(matrix[Endrow][i] + " ");
            }

            //Left
            for (int j = Endrow - 1; j >= Startrow + 1; j--) {
                if (Startcol == Endcol) {
                    break;
                }
                System.out.print(matrix[j][Startcol] + " ");
            }

            Startrow++;
            Startcol++;
            Endrow--;
            Endcol--;

        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        spiral(matrix);
    }
}

import java.util.Scanner;

/**
 * Created by George on 24-Apr-17 on Apr at 1:47 AM.
 */
public class Maths {

    public static void main(String[] args){
        byte m, n, c, d;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of the matrix");
        m = in.nextByte();
        n = in.nextByte();

        byte matrix[][] = new byte[m][n];

        for(c = 0; c < m; c++)
            for(d = 0; d < n; d++)
                matrix[c][d] = in.nextByte();

        int transpose[][] = new int[n][m];

        for(c = 0; c < m; c++){
            for(d = 0; d < n; d++)
                transpose[d][c] = matrix[c][d];
        }
        System.out.println("Transposed matrix");
        for(c = 0; c < n; c++){
            for(d = 0; d < m; d++){
                System.out.println(transpose[c][d] + "\t");
                System.out.println("\n");
            }
        }
    }
}

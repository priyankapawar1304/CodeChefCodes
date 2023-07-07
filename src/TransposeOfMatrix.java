import java.util.*;
public class TransposeOfMatrix {
    public static void main(String[] args){
        int[][]A={
                {1,2,3},
                {4,5,6},
                {7,8,9}
                };
        int rows=A.length;
        int col=A[0].length;
        int t[][]=new int[col][rows];
        for(int i=0;i<col;i++){
            for(int j=0;j<rows;j++){
              t[i][j]=A[j][i];
            }
        }
        System.out.println("The transpose of the matrix is:");
        for(int i=0;i<col;i++){
            for(int j=0;j<rows;j++){
                System.out.println(t[i][j]+" ");
            }
        }

    }
}

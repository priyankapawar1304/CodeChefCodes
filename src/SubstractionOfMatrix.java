import java.util.*;
public class SubstractionOfMatrix {
    public static void main(String[] args){
        int A[][]={
                {5,4,6},
                {7,5,1},
                {9,7,6}
                };
        int B[][]={
                {1,2,3},
                {4,2,5},
                {4,3,1}
                };
        int rows=A.length;
        int col=A[0].length;
        int diff[][]=new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                diff[i][j]=A[i][j]-B[i][j];
            }
        }
        System.out.println("the matrix after subtraction");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.println(diff[i][j]+" ");
            }
        }
    }
}

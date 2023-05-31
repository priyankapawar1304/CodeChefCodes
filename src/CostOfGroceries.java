import java.util.*;
import java.lang.*;
import java.io.*;

public class CostOfGroceries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int X=sc.nextInt();
            int A[]=new int[N];
            int B[]=new int[N];
            int cost=0;
            for(int i=0;i<N;i++){
                A[i]=sc.nextInt();
            }
            for(int i=0;i<N;i++){
                B[i]=sc.nextInt();
            }
            for(int i=0;i<N;i++){
                if(A[i]>=X){
                    cost+=B[i];
                }
            }
            System.out.println(cost);

        }
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;
public class LargestAndSecondLargestMaxSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int[] A=new int[N];
            for(int i=0;i<N;i++){
                A[i]=sc.nextInt();
            }
            Arrays.sort(A);
            for(int i=N-1;i>=0;){
                if(A[i] !=A[i-1]){
                    System.out.println(A[i]+A[i=1]);
                    break;
                }
                else{
                    i--;
                }
            }
        }
    }
}

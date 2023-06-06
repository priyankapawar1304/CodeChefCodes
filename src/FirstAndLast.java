import java.util.*;
import java.lang.*;
import java.io.*;
public class FirstAndLast {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            long A[]=new long[N];
            for(int i=0;i<N;i++){
                A[i]=sc.nextInt();
            }
            long Max=A[0]+A[N-1];
            long sum=0;
            for(int i=0;i<N-1;i++){
                long temp=A[i]+A[i+1];
                if(temp>sum){
                    sum=temp;
                }
            }
            System.out.println(Math.max(sum,Max));

        }
    }
}

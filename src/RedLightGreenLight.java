import java.util.*;
import java.lang.*;
import java.io.*;
public class RedLightGreenLight{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int K=sc.nextInt();
            int[] arr=new int[N];
            int count=0;
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
                if(arr[i]>K){
                    count=count+1;
                }
            }
            System.out.println(count);
        }
        // your code goes here
    }

}
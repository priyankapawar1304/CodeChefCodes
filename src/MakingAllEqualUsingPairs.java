import java.util.*;
import java.lang.*;
import java.io.*;
public class MakingAllEqualUsingPairs {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int[] A=new int[N];
            int[] freq=new int[1001];
            for(int i=0;i<N;i++){
                A[i]=sc.nextInt();
                freq[A[i]]++;

            }
            Arrays.sort(freq);
            System.out.println(N-freq[1000]);
        }
    }
}

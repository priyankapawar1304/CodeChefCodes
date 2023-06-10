import java.util.*;
import java.lang.*;
import java.io.*;
public class CircularTrack {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int A=sc.nextInt();
            int B=sc.nextInt();
            int M=sc.nextInt();
            int val=Math.abs(A-B);
            if(val>M/2){
                System.out.println(M-val);

            }
            else{
                System.out.println(val);
            }
        }
    }
}


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class DistanceColouring
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int K=sc.nextInt();
            if((N-K)<K){
                if(K==1){
                    System.out.println(1);
                }
                else{
                    System.out.println(2);
                }
            }
            else{
                System.out.println(1);
            }
        }
        // your code goes here
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int M=sc.nextInt();
            if((M+N)/2==0){
                System.out.println("Yes");

            }
            else{
                System.out.println("No");
            }
        }

        // your code goes here
    }
}

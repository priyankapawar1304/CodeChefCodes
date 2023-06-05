import java.util.*;
import java.lang.*;
import java.io.*;
public class ExistanceOfEquation {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            long X=sc.nextLong();
            long Y=sc.nextLong();
            long a=(X*X*X*X)+(4*Y*Y);
            long b=4*(X*X*Y);
            if(a==b){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        // your code goes here
    }
}

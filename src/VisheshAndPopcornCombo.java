import java.util.*;
import java.lang.*;
import java.io.*;
public class VisheshAndPopcornCombo {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int A1=sc.nextInt();
            int A2=sc.nextInt();
            int B1=sc.nextInt();
            int B2=sc.nextInt();
            int C1=sc.nextInt();
            int C2=sc.nextInt();
            int A=A1+A2;
            int B=B1+B2;
            int C=C1+C2;
            System.out.println(Math.max(A,Math.max(B,C)));
        }
    }
}

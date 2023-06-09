import java.util.*;
import java.lang.*;
import java.io.*;
public class BlockGamePalindrome {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int N=sc.nextInt();
            int temp=N;
            int sum=0;
            while(N!=0){
                int rem=N%10;
                sum=sum*10+rem;
                N=N/10;
            }
            if(sum==temp){
                System.out.println("wins");
            }
            else{
                System.out.println("loses");
            }
        }
    }
}

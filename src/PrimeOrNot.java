import java.util.*;
import java.lang.*;
import java.io.*;

public class PrimeOrNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int count=0;
            int N=sc.nextInt();
            for(int j=1;j<=N;j++){
                if(N%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;
public class BackToCampus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int K=sc.nextInt();
            if(N%K==0){
                System.out.println(N/K);
            }
            else{
                System.out.println((N/K)+1);
            }
        }
    }
}

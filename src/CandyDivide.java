import java.util.*;
import java.lang.*;
import java.io.*;
public class CandyDivide {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            if(N%3==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}

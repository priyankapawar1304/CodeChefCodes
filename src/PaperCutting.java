import java.util.*;
import java.lang.*;
import java.io.*;
public class PaperCutting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int N=sc.nextInt();
            int K=sc.nextInt();
            System.out.println((N/K)*(N/K));
        }
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;
public class FitSquaresInTriangle {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int B=sc.nextInt();
            System.out.println(((B/2)*(B/2)-(B/2))/2);
        }
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;
public class CarsAndBikes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            if(N%2==0 && N%4==0){
                System.out.println("N0");
            }
            else{
                System.out.println("Yes");
            }
        }

    }
}

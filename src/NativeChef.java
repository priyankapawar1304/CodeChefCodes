import java.util.*;
import java.lang.*;
import java.io.*;
public class NativeChef {
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for(int i=0; i<t; i++){
            int n = read.nextInt();
            int a = read.nextInt();
            int b = read.nextInt();
            float ca = 0;
            float cb = 0;
            int[] x = new int[n];
            for(int j=0; j<n; j++){
                int ele = read.nextInt();
                x[j] = ele;
                if(x[j]==a){
                    ca = ca + 1;
                }
                if(x[j]==b){
                    cb = cb + 1;
                }
            }
            System.out.println((ca/n)*(cb/n));
        }
        // your code goes here
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;
public class lazyChef {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int x=sc.nextInt();
            int m=sc.nextInt();
            int d=sc.nextInt();
            System.out.println(Math.min(x*m,x+d));
        }

    }
}

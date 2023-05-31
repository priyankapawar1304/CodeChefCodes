import java.util.*;
import java.lang.*;
import java.io.*;
public class CountingPreetyNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int L=sc.nextInt();
            int R=sc.nextInt();
            int count=0;
            for(int i=L;i<=R;i++){
                int r=i%10;
                if(r==2 || r==3 || r==9){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;
public class WaterFilling {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int B1=sc.nextInt();
            int B2=sc.nextInt();
            int B3=sc.nextInt();
            if(B1==0 && B2==0 && B3==0 || B1==1 && B2==0 && B3==0 || B1==0 && B2==1 && B3==0 || B1==0 && B2==0 && B3==1){
                System.out.println("Water filling time");
            }
            else{
                System.out.println("Not now");
            }

        }
    }
}

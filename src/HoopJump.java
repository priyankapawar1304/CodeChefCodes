import java.util.*;
import java.lang.*;
import java.io.*;
public class HoopJump {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            if(N==1){
                System.out.println(1);
            }
            else{
                System.out.println(N/2+1);
            }
        }
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;
public class MarioAndBrokenString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            String s;
            s=sc.next();
            int count=0;
            for(int i=0;i<N/2;i++){
                if(s.charAt(i)==s.charAt((N/2)+i)){
                    count++;
                }
            }
            if(count==N/2){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}

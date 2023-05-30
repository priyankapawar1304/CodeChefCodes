import java.util.*;
import java.lang.*;
import java.io.*;
public class Contest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int s1=0,s2=0;
            while(N-->0){
                String s=sc.next();
                if(s.equals("START38")){
                    s1++;
                }
                else{
                    s2++;
                }
            }
            System.out.println(s1+" "+s2);
        }
    }
}

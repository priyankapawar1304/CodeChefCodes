import java.util.*;
import java.lang.*;
import java.io.*;
public class DnaStorage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            String S=sc.next();
            for(int i=0;i<S.length();i+=2){
                char A=S.charAt(i);
                char B=S.charAt(i);
                if(A=='0' && B=='0'){
                    System.out.print("A");
                }
                else if(A=='0' && B=='1'){
                    System.out.print("T");
                }
                else if(A=='1' && B=='0'){
                    System.out.print("C");
                }
                else{
                    System.out.print("G");
                }
            }
            System.out.println();
        }
    }
}

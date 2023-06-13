import java.util.*;
import java.lang.*;
import java.io.*;
public class ColorOfBallons {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            String s=sc.next();
            int countA=0;
            int countB=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='a'){
                    countA++;
                }
                else if(s.charAt(i)=='b'){
                    countB++;
                }
            }
            System.out.println(Math.min(countA,countB));
        }
    }
}

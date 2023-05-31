import java.util.*;
import java.lang.*;
import java.io.*;
public class hardestProblemBet {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0){
            int sa=scan.nextInt();
            int sb=scan.nextInt();
            int sc=scan.nextInt();
            if(sa<sb){
                if(sa<sc){
                    System.out.println("Draw");
                }
                else{
                    System.out.println("Alice");
                }

            }
            else if(sb<sc){
                System.out.println("Bob");
            }
            else{
                System.out.println("Alice");
            }
        }

    }
}

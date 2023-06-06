import java.util.*;
import java.lang.*;
import java.io.*;
public class ChefAndPairingSlippers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int L=sc.nextInt();
            int X=sc.nextInt();
            int R=N-L;
            if(L<R){
                System.out.println(L*X);
            }
            else if(L==R){
                System.out.println(L*X);
            }
            else{
                System.out.println(R*X);
            }
        }
    }
}

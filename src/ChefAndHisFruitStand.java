import java.util.*;
import java.lang.*;
import java.io.*;
public class ChefAndHisFruitStand {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int X=sc.nextInt();
            int Y=sc.nextInt();
            if(X/2<=Y){
                System.out.println(X/2);
            }
            else{
                System.out.println(Y);
            }
        }
    }
}

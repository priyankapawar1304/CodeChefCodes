import java.util.*;
import java.lang.*;
import java.io.*;
public class DrunkAlcoholic {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int k=sc.nextInt();
            int count=0;
            for(int j=1;j<k+1;j++){
                if(j%2==1){
                    count=count+3;
                }
                if(j%2==0){
                    count=count-1;
                }
            }
            System.out.println(count);
        }
    }
}

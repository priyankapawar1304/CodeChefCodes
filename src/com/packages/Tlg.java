package com.packages;
import java.util.*;
import java.lang.*;
public class Tlg {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a1=0,b1=0,lead=0,win=-1;
        while(t!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            a1+=a;
            b1+=b;
            if((a1-b1)>lead){
                win=1;
                lead=a1-b1;

            }
            else if((b1-a1)>lead){
                win=2;
                lead=b1-a1;
            }
            t--;
        }
        System.out.println(win+" "+lead);

    }

}

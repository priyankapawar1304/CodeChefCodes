package com;
import java.util.*;
import java.lang.*;
import java.io.*;

public class TheCoolerDilema {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int X=sc.nextInt();
            int Y=sc.nextInt();
            if(Y%X!=0){
                System.out.println(Y/X);
            }
            else{
                System.out.println((Y/X)-1);
            }
        }

    }
}

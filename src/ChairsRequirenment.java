

import java.util.*;
import java.lang.*;
import java.io.*;
class ChairsRequirement
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int s=sc.nextInt();
            int c=sc.nextInt();
            if(s<=c){
                System.out.println("0");
            }
            else{
                System.out.println(s-c);
            }
        }
    }
}
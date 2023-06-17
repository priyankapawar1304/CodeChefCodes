import java.util.*;
import java.lang.*;
import java.io.*;
public class ReversingAString {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("pinky");
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);

        }
        System.out.println(sb);
    }
}
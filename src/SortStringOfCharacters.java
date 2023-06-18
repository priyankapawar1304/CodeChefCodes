import java.util.*;
import java.lang.*;
import java.io.*;
public class SortStringOfCharacters {
    public static void sortString(String s){
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        System.out.println(String.valueOf(arr));
    }
    public static void main(String[] args){
        String s="geeksForGeeks";
        sortString(s);
    }
}

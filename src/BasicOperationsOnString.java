import java.util.*;
import java.lang.*;
import java.io.*;
public class BasicOperationsOnString {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Pinky");
        System.out.println(sb.charAt(0));   //outputs the character at zeroth index
        sb.setCharAt(0,'p');
        System.out.println(sb);       //sets small p at 0th indes of Pinky
        sb.insert(0,'m');     //inserts or adds the character at the specific index
        System.out.println(sb);
        sb.delete(0,1);
        System.out.println(sb);        //delets the specific character but lmit or range is given
        sb.append('y');
        System.out.println(sb);
    }
}

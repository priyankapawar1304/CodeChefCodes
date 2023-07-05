import java.util.*;
public class BestOfTwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int A1=sc.nextInt();
            int A2=sc.nextInt();
            int A3=sc.nextInt();
            int B1=sc.nextInt();
            int B2=sc.nextInt();
            int B3=sc.nextInt();
            int D=A1+A2+A3;
            int E=B1+B2+B3;
            if(D>E){
                System.out.println("Alice");

            }
            else if(D==E){
                System.out.println("Tie");
            }
            else{
                System.out.println("Bob");
            }

        }
    }
}



/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class NoOfCredits
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0) {

            int RTP_courses = sc.nextInt();
            int Audit_courses = sc.nextInt();
            int Non_RTP_courses = sc.nextInt();
            int total_credits = 4*RTP_courses + 2*Audit_courses;
            System.out.println(total_credits);
        }


    }
}

package program;
import java.util.*;
import java.lang.*;
import java.io.*;

public class checkNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
	     int t = sc.nextInt();
	     sc.nextLine();
	      while(t>0)
	        {
	             String s=sc.next();
	            String s1=sc.next();
	            String s2=s1.substring(2)+s1.substring(0,2);
	            String s3=s1.substring(s1.length()-2)+s1.substring(0,(s1.length()-2));
	            if(s.equals(s2)||s.equals(s3))
	            {
	                 System.out.println("1");
	            }
	            else
	                 System.out.println("0");
	            t--;
	        }

	}

}

package program;
import java.util.*;
import java.util.Scanner;

public class reverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 
		 {
		     String s=sc.next();
		     String str="";
		     int l=s.length();
		     String[] arr=s.split("\\.");
		     for(int i=arr.length-1;i>=0;i--)
		     {
		         str=str+arr[i];
		         if(i>0)
		         {
		             str=str+".";
		         }
		       System.out.println(str);  
		     }
		 }t--;
	}

}

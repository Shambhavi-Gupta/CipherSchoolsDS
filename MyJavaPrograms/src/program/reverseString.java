package program;
import java.util.*;
import java.lang.*;
import java.io.*;
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     while(t > 0)
	     {
	     String sent = sc.next();
	     String[] strArray = sent.split("\\.");
	     String result;
	     for (int i = 0; i < strArray.length; i++) 
	     {
	     result = "";
	     
	     for (int j = strArray[i].length() - 1; j >= 0; j--)  
	     {
	     result = result + strArray[i].charAt(j);
	     }
	  System.out.print(result);
	 // System.out.println();
	   if(i != strArray.length - 1) 
	   {
	     System.out.print(".");
	   }
	  }
	System.out.println();
	t--;
		
		 }
	}
	}



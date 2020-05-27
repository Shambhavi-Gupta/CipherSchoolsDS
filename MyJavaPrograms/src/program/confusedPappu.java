package program;
import java.util.*;
import java.lang.*;
import java.io.*;

public class confusedPappu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
		     String s=sc.next();
		     StringBuffer a = new StringBuffer("");
		     for(int i=0;i<s.length();i++)
		     {
		         if(s.charAt(i)=='6')
		         {
		             a=a.append("9");
		         }
		         else
		         {
		             char ch=s.charAt(i);
		             a=a.append(ch);
		         }
		     }
		     int x=Integer.parseInt(s);
		     String l=String.valueOf(a);
		     int y=Integer.parseInt(l);
		     System.out.println(y-x);
		     t--;
		 }
	}

}

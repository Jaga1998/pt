/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class maxprefix
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int t=0;t<n;t++)
		{
			String s=sc.next();
			String s1=sc.next();
			String result="";
			int n1=s.length();
			int n2=s1.length();
			for(int i=0,j=0;i<n1-1&&j<n2-1;i++,j++)
			{
				if(s.charAt(i)==s1.charAt(j))
				{
					result=result+s.charAt(i);
				}
			}
			System.out.println(result);
		}
	}
}

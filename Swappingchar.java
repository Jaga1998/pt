/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
publi class Swappingchar
{
	public static void main (String[] args) throws java.lang.Exception
	{ 
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		char temp;
		char a[]=s.toCharArray();
		for(int i=0;i<s.length()-1;i=i+2)
		{  temp=a[i];
		 a[i]=a[i+1];
		 a[i+1]=temp;
		
		}
		System.out.println(a);
	}
}

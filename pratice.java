/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean k=true;
		while(n!=0)
		{
			if(n-2*a>0)
			{
				n=n-2*a;
				k=true;
			}
			else
			k=false;
			if(n-2*b>0)
			{
				n=n-2*b;
				k=true;
			}
			else
			k=false;
			
		}
		if(k)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}

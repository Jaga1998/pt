/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Set2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<k;j++)
		{
			int u=sc.nextInt();
			int v=sc.nextInt();
			int sum=0;
			for(int i=u-1;i<v;i++)
			{
				sum=sum+arr[i];
			}
			System.out.println(sum);
		}
	}
}

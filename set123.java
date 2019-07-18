/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class set123
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		
		}
		 int sum=0;
		 int sum1=0;
		 Arrays.sort(arr);
		 for(int i=0;i<n;i=i+2)
		 {
		 	sum=sum+arr[i];
		 }
		 for(int i=1;i<n;i=i+2)
	{
		sum1=sum1+arr[i];
	}
		if(sum>sum1)
		System.out.println(sum);
		else
		System.out.println(sum1);
	}
}

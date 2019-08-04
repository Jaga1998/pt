/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
public class findaverage
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
		int avg=0;
		int avg1=0;
		if(n%2==0)
		{
		for(int i=0;i<n/2;i++)
		{
			sum=sum+arr[i];
		}
		for(int j=n/2;j<n;j++)
		{
			sum1=sum1+arr[j];
		}
		 avg=sum/(n/2);
		 avg1=sum1/(n/2);
		   if(avg==avg1)
			System.out.println("Yes");
		    else
		   System.out.println("no");
		}
		if(n%2==1)
		{
		for(int i=0;i<n/2;i++)
		{
			sum=sum+arr[i];
		}
		for(int j=(n+1)/2;j<n;j++)
		{
			sum1=sum1+arr[j];
		}
	   avg=sum/(n/2);
		avg1=sum1/(n/2);
		   if(avg==avg1&&avg==arr[n/2])
		  System.out.println("Yes");
		    else
		   System.out.println("no");	
		}
	}
	}

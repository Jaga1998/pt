/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class triplets
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i,j,k;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
	
		}
		int count=0;

		for(i=0;i<n-2;i++)
		{ 
			for(j=i+1;j<n-1;j++)
		{
			for(k=j+1;k<n;k++)
			{
				if(arr[i]<arr[j]&&arr[j]<arr[k])
				 count++;
			}
		
		}
			
		}
		System.out.println(count);
	}
}

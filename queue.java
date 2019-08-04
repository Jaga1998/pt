/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;


/* Name of the class has to be "Main" only if the class is public. */
public class queue
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int count=1;
		int count2=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>count)
			{
				count2++;
			}
			count=count+i;
		}
		System.out.println(count2);
	}
}

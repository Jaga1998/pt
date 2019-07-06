/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;

/* Name of the class has to be "Main" only if the class is public. */
public class firstrepeat
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]==arr[i+1]){
			System.out.println(arr[i]);
			count++;
		
			break;
		}
		}
		if(count==0)
		System.out.println("unique");
	}
}

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class kthlargest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=1;i<n;i++)
		{ 
			arr[i]=sc.nextInt();
		}
	
	Arrays.sort(arr);
	System.out.println(arr[k]);
}
}

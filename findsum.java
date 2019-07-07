/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class findsum
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
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{ for(int k=j+1;k<n;k++)
			{
				if(arr[i]+arr[j]==arr[k])
				{
					System.out.print(arr[i]+" "+arr[j]+" "+arr[k]);
					System.out.println();
				}
			}
		}
	}
}
}

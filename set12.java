import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class set12
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
			int min=arr[u-1];
			for(int i=u-1;i<v;i++)
			{ 
				if(arr[u-1]<arr[i])
				min=arr[u-1];
				else
				min=arr[i];
				
				
			}
			System.out.println(min);
		}
	}
}

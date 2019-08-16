// java program to get total XOR 
// of all subarray xors
import java.io.*;
import java.util.Scanner;
public class xorofgivenrange { 
		
	// Returns XOR of all subarray xors 
	static int getTotalXorOfSubarrayXors( 
						int arr[], int u,int v) 
	{ 
		
		// initialize result by 
		// 0 as (a xor 0 = a) 
		int res = 0; 
		
		// select the starting element 
		for (int i = u; i < v; i++) 

				res = res ^ arr[i]; 
	
		return res; 
	} 
	
	// Drive code 
	public static void main(String args[]) 
	{ Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int t=sc.nextInt();
	  int arr[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
	  	arr[i]=sc.nextInt();
	  }
	  for(int j=0;j<t;j++)
	  {
	  int u=sc.nextInt();
	  int v=sc.nextInt();
	  u=u-1;
	  
	 
	 
		
		System.out.println( 
			getTotalXorOfSubarrayXors(arr, u,v)); 
	} 
} 

}

// Java program to check if given array 
// has 2 elements whose sum is equal 
// to the given value
import java.io.*;
import java.util.*; 
import java.util.Scanner;

public class arraypair
{ 
	// Function to check if array has 2 elements 
	// whose sum is equal to the given value 
	static boolean hasArrayTwoCandidates(int A[], 
						int arr_size, int sum) 
	{ 
		int l, r; 
	
		/* Sort the elements */
		Arrays.sort(A); 
	
		/* Now look for the two candidates 
		in the sorted array*/
		l = 0; 
		r = arr_size-1; 
		while (l < r) 
		{ 
			if(A[l] + A[r] == sum) 
				return true; 
			else if(A[l] + A[r] < sum) 
				l++; 
			else // A[i] + A[j] > sum 
				r--; 
		} 
		return false; 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ Scanner sc=new Scanner(System.in); 
      int n=sc.nextInt();
     int k = sc.nextInt(); 
		int A[] = new int[n];
      for(int i=0;i<n;i++)
      {
        A[i]=sc.nextInt();
      }
		
		int arr_size = A.length; 
		
		// Function calling 
		if(hasArrayTwoCandidates(A, arr_size, n)) 
			System.out.println("Yes"); 
		else
			System.out.println("no"); 
	
	} 

} 

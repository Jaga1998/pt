/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Java program to find whether an array 
// is subset of another array 
public class Main 
{ 
	/* Return true if arr2[] is a subset of arr1[] */
	static boolean isSubset(int arr1[], int arr2[], int m, int n) 
	{ 
		int i = 0; 
		
		sort(arr1, 0, m-1); 
		for (i=0; i<n; i++) 
		{ 
			if (binarySearch(arr1, 0, m-1, arr2[i]) == -1) 
			return false; 
		} 
		
		/* If we reach here then all elements of arr2[] 
		are present in arr1[] */
		return true; 
	} 
		
	/* FOLLOWING FUNCTIONS ARE ONLY FOR SEARCHING AND SORTING PURPOSE */
	/* Standard Binary Search function*/
	static int binarySearch(int arr[], int low, int high, int x) 
	{ 
	if(high >= low) 
	{ 
		int mid = (low + high)/2; /*low + (high - low)/2;*/
		
		/* Check if arr[mid] is the first occurrence of x. 
			arr[mid] is first occurrence if x is one of the following 
			is true: 
			(i) mid == 0 and arr[mid] == x 
			(ii) arr[mid-1] < x and arr[mid] == x 
		*/
		if(( mid == 0 || x > arr[mid-1]) && (arr[mid] == x)) 
		return mid; 
		else if(x > arr[mid]) 
		return binarySearch(arr, (mid + 1), high, x); 
		else
		return binarySearch(arr, low, (mid -1), x); 
	} 
	return -1; 
	} 
	
	/* This function takes last element as pivot, 
	places the pivot element at its correct 
	position in sorted array, and places all 
	smaller (smaller than pivot) to left of 
	pivot and all greater elements to right 
	of pivot */
	static int partition(int arr[], int low, int high) 
	{ 
		int pivot = arr[high]; 
		int i = (low-1); // index of smaller element 
		for (int j=low; j<high; j++) 
		{ 
			// If current element is smaller than or 
			// equal to pivot 
			if (arr[j] <= pivot) 
			{ 
				i++; 

				// swap arr[i] and arr[j] 
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 

		// swap arr[i+1] and arr[high] (or pivot) 
		int temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp; 

		return i+1; 
	} 


	/* The main function that implements QuickSort() 
	arr[] --> Array to be sorted, 
	low --> Starting index, 
	high --> Ending index */
	static void sort(int arr[], int low, int high) 
	{ 
		if (low < high) 
		{ 
			/* pi is partitioning index, arr[pi] is 
			now at right place */
			int pi = partition(arr, low, high); 

			// Recursively sort elements before 
			// partition and after partition 
			sort(arr, low, pi-1); 
			sort(arr, pi+1, high); 
		} 
	} 
	
	public static void main(String args[]) 
	{   Scanner sc=new Scanner(System.in);
	
		int one=sc.nextInt();
	    int two=sc.nextInt();
		int arr1[] = new int[one];
		for(int i=0;i<one;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int arr2[] = new int[two];
		for(int i=0;i<two;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		int m = arr1.length; 
		int n = arr2.length; 
	
		if(isSubset(arr1, arr2, m, n)) 
		System.out.print("YES "); 
		else
		System.out.print("NO"); 
	} 
} 

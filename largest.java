/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class largest
{
// Function to generate largest  
// possible number with given digits 
static int findMaxNum(int arr[], int n) 
{  
    // sort the given array in 
    // ascending order and then 
    // traverse into descending 
    Arrays.sort(arr); 
      
    int num = arr[n-1]; 
      
    // generate the number 
    for(int i = n - 2; i >= 0; i--) 
    { 
        num = num * 10 + arr[i]; 
    } 
      
    return num; 
} 
 
// This code is contributed by mits 
	public static void main (String[] args) throws java.lang.Exception
	{ Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
         System.out.println(findMaxNum(arr, n)); 
         
        
	}
}

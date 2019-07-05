/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class onetime
{
	 static int findSingle(int ar[], int n) 
    { 
        // Do XOR of all elements and return 
        int M= ar[0]; 
        for (int i = 1; i <n; i++) 
            M = M ^ ar[i]; 
      
        return M; 
    } 
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
	System.out.println(findSingle(ar, n) + " "); 
}
}

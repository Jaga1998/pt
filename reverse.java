/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class reverse
{
	public static void main (String[] args) throws java.lang.Exception
	{   Scanner sc= new Scanner(System.in);
         String input = sc.next();
  
        char[] s1 = input.toCharArray(); 
  
        for (int i = s1.length-1; i>=0; i--) 
            System.out.print(s1[i]); 
	}
}

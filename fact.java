/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


public class fact
{
	public static void main (String[] args) throws java.lang.Exception
	{Scanner sc=new Scanner(System.in);
		 int i,fact=1;  
  int num=sc.nextInt();    
  for(i=1;i<=num;i++){    
      fact=fact*i;    
  }    
  System.out.println(fact);    
	}
}

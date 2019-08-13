/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class cost1
{
      static int updation(String str1,String str2)
      {
      	int n1=str1.length();
      	int n2=str2.length();
      	int k= Math.abs(n2-n1);
      	for(int i=0,j=0;i<n1&&j<n2;i++,j++)
      	{
      		if(str1.charAt(i)!=str2.charAt(j))
      		{
      			k=k+(str1.charAt(i)-str2.charAt(j));
      		}
      	}
      	return k;
      }
/* Name of the class has to be "Main" only if the class is public. */
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int result=updation(s1,s2);
		System.out.println(Math.abs(result));
	}
}

import java.io.*;
import java.util.Scanner;

public class combinations { 

static void printAllKLength(char[] set, int k) 
{ 
	int n = set.length; 
	printAllKLengthRec(set, "", n, k); 
} 

static void printAllKLengthRec(char[] set, 
							String prefix, 
							int n, int k) 
{ 
	
	if (k == 0) 
	{ 
		System.out.println(prefix); 
		return; 
	} 

	for (int i = 0; i < n; ++i) 
	{ 
		String newPrefix = prefix + set[i]; 
		
		printAllKLengthRec(set, newPrefix, 
								n, k - 1); 
	} 
} 


public static void main(String[] args) 
{ 
	Scanner sc=new Scanner(System.in); 
	char[] set1 = {'0', '1'}; 
	int k = sc.nextInt(); 
	printAllKLength(set1, k); 
	
	
} 
} 

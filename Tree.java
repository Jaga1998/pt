// Java program to construct binary tree from 
// given array in level order fashion
import java.io.*;
import java.util.Scanner;

 public class Tree { 
	Node root; 

	// Tree Node 
	static class Node { 
		int data; 
		Node left, right; 
		Node(int data) 
		{ 
			this.data = data; 
			this.left = null; 
			this.right = null; 
		} 
	} 

	// Function to insert nodes in level order 
	public Node insertLevelOrder(int[] arr, Node root,int i) 
												
	{ 
		// Base case for recursion 
		if (i < arr.length) { 
			Node temp = new Node(arr[i]); 
			root = temp; 

			// insert left child 
			root.left = insertLevelOrder(arr, root.left, 
											2 * i + 1); 

			// insert right child 
			root.right = insertLevelOrder(arr, root.right, 
											2 * i + 2); 
		} 
		return root; 
	}                   
	static boolean ifNodeExists( Node node, int key)  
{  
    if (node == null)  
        return false;  
  
    if (node.data == key)  
        return true;  
  
    // then recur on left sutree / 
    boolean res1 = ifNodeExists(node.left, key);  
  
    // now recur on right subtree / 
    boolean res2 = ifNodeExists(node.right, key);  
  
    return res1 || res2;  
}  
	
	
	
  int findMax(Node node) 
    { 
        if (node == null) 
            return Integer.MIN_VALUE; 
  
        int res = node.data; 
        int lres = findMax(node.left); 
        int rres = findMax(node.right); 
  
        if (lres > res) 
            res = lres; 
        if (rres > res) 
            res = rres; 
        return res; 
    } 

	// Function to print tree nodes in InOrder fashion 
	public void inOrder(Node root) 
	{ 
		if (root != null) { 
			inOrder(root.left); 
			System.out.print(root.data + " "); 
			inOrder(root.right); 
		} 
	} 
	

	// Driver program to test above function 
	public static void main(String args[]) 
	{  Scanner sc= new Scanner(System.in);
		Tree t2 = new Tree(); 
      int k=sc.nextInt();
		int arr[] = new int[k];
      for(int i=0;i<k;i++)
      {
        arr[i]=sc.nextInt();
      }
		t2.root = t2.insertLevelOrder(arr, t2.root, 0); 
		t2.inOrder(t2.root);
		int j=t2.findMax(t2.root);
		System.out.println();
		System.out.println(j);
		int key=sc.nextInt();
		if(ifNodeExists(t2.root,key))
		System.out.println("yes");
		else
		System.out.println("no");
	} 
} 

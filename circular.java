// Write Java code here 
// A Java program to check if 
// the given path for a robot 
// is circular or not 
import java.util.Scanner;
public class circular { 

// Macros for East, North, South and West 

// This function returns true if 
// the given path is circular, 
// else false 
static boolean isCircular(char path[]) 
{ 
// Initialize starting 
// point for robot as 
// (0, 0) and starting 
// direction as N North 
int x = 0, y = 0; 
int dir = 0; 

for (int i=0; i < path.length; i++) 
{
	char move = path[i]; 


	if (move == 'R') 
		dir = (dir + 1)%4; 
	else if (move == 'L') 
		dir = (4 + dir - 1) % 4; 


	else 
	{ 
		if (dir == 0) 
			y++; 
		else if (dir == 1) 
			x++; 
		else if (dir == 2) 
			y--; 
		else // dir == 3 
			x--; 
	} 
} 

// If robot comes back to 
// (0, 0), then path is cyclic 
return (x == 0 && y == 0); 
} 

// Driver program 
public static void main(String[] args) 
{ 
	Scanner sc= new Scanner(System.in);
	String path_ = sc.next(); 
	char path[] = path_.toCharArray(); 

	if (isCircular(path)) 
	System.out.println("yes"); 
	else
	System.out.println("no"); 
} 
} 


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter X Y");
		String inputLine = scanner.nextLine();
		String[] inputParts = inputLine.split(" ");
		int X = Integer.parseInt(inputParts[0]);
		int Y = Integer.parseInt(inputParts[1]);
		if (Y > X) {
		   System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
	}
}

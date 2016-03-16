package version0;

import java.util.Scanner;

public class ServerCreation 
{
	public static void main(String[] args)
	{
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Welcome to creation of FaltaVista Search Engine ");
		
		System.out.print("Enter Max requests size in cache. C=");
		int C=scanner.nextInt();
		
		System.out.println("Enter Min frequency size for a req to be saved in cache. M=");
		int M=scanner.nextInt();
		
		System.out.println("Enter Max num of S-Threads for the server. S=");
		int S=scanner.nextInt();
		
	
		
	}
}

package basicJava;

import java.util.Scanner;

public class Gitproject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		if (x>y && x>z)
		{
			System.out.println(x+" is the greatest number");
		}
		
		else if (y>x && y>z)
		{
			System.out.println(y+" is the greatest number");
		}
		else 
		{
			System.out.println(z+" is the greatest number");
		}
		
		input.close();
		
	}

}

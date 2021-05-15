package program;

import java.util.Scanner;

public class EvenNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a value");
		
		int value=scanner.nextInt();
		
		if(value%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}

}

package program;

public class TrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		try
		{
			age=17;
			
			if(age<18)
			{
				throw new ArithmeticException("Not eligible for voting");
			}
			
			else
			{
				System.out.println("Eligible for Voting");
			}

			
		}catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException Handled");
		}
		
	
	}

}

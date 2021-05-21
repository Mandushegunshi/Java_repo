package program;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowsExample a=new ThrowsExample();
		try 
		{
		a.Display(20);
		}
		catch(Exception e) 
		{
			System.out.println("Exception Handled");
			
		}

	}
	public void Display(int age)  throws ArithmeticException
	{
		
		
			 
			
			if(age<18)
			{
				throw new ArithmeticException("Not eligible for voting");
			}
			
			else
			{
				System.out.println("Eligible for Voting");
			}
	}

}

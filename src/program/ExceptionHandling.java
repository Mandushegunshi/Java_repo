package program;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=0;
		
		try
		{
			int result=a/b;
			System.out.println("found");
			
			System.out.println("Exception over");
			
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException Handled");
		}
		catch(Exception e){
			System.out.println("Exception Handled");
			
		}
		
		int myarray[]= {1,2,3,4,5};
		try {
			System.out.println("myarray: "+myarray[3]);
		}catch(Exception e) {
			System.out.println("Exception Handled");
		}
		
		

	}

}

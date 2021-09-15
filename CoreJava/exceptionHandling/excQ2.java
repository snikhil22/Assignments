package CoreJava.exceptionHandling;

public class excQ2 {

	public static void main(String[] args) {
		int n1=3,n2=0;
		try
		{
			if(n2==0)
			throw new UnsupportedOperationException();
			System.out.println("Result:"+n1/n2);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error: "+e);
		}
		catch(UnsupportedOperationException e)
		{
			System.out.println("Error: "+e);
		}
	}

}
 
package CoreJava.exceptionHandling;

public class excQ1 {

	public static void main(String[] args) {
		int n1=3,n2=0;
		try
		{
			System.out.println("Result:"+n1/n2);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error: "+e);
		}
	}

}
 
package CoreJava.Java11;

import java.util.Scanner;

@FunctionalInterface
interface myLambda{
	var perform(var x,var y,var z);
}

public class j11Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of Principal,Rate and Time(in years)");
		double p=sc.nextDouble();
		double rate=sc.nextDouble();
		double time=sc.nextDouble();
		
		myLambda si=((x,y,z)->x*y*z/100);
		System.out.println("Simple interest for given data : "+si.perform(p, rate, time));
		
	}

}

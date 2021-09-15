package CoreJava.basicDataStructure;

import java.util.Scanner;

public class dsQ3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of Principal,Rate and Time(in years)");
		double p=sc.nextDouble();
		double rate=sc.nextDouble();
		double time=sc.nextDouble();
		System.out.println("Enter value of Compounding Frequency");
		double cf=sc.nextDouble();
		double si=(p*rate*time)/100;
		System.out.println("Simple Interest : "+si);
		double ci=p*(Math.pow((1 + rate/100),(time*cf))) - p;
		System.out.println("Compound Interest : "+ci);

	}

}

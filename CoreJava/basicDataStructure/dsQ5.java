package CoreJava.basicDataStructure;

import java.util.Scanner;

public class dsQ5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter CTC");
		double ctc=sc.nextDouble();
		double tax;
		if(ctc>0 && ctc<=180000)
			System.out.println("No Income Tax Applicable");
		else if(ctc>=181001 && ctc<=300000)
		{	
			tax=ctc*0.1;
			System.out.println("Tax Payable: "+tax);
		}
		else if(ctc>=300001 && ctc<=500000)
		{	
			tax=ctc*0.2;
			System.out.println("Tax Payable: "+tax);
		}
		else if(ctc>=500001 && ctc<=1000000)
		{	
			tax=ctc*0.3;
			System.out.println("Tax Payable: "+tax);
		}

	}

}

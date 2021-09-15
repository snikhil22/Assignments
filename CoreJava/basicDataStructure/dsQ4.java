package CoreJava.basicDataStructure;

import java.util.Scanner;

public class dsQ4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of 3 subjects ");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		if(m1>60 && m2>60 && m3>60)
				System.out.println("Passed");
		else if((m1<60 && m2>60 && m3>60) || (m1>60 && m2<60 && m3>60) || (m1>60 && m2>60 && m3<60))
				System.out.println("Promoted");
		else
				System.out.println("Failed");

	}

}

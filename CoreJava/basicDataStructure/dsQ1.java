package CoreJava.basicDataStructure;

import java.util.*;

public class dsQ1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(temp>0)
		{
			int a=temp%10;
			sum+=(a*a*a);
			temp/=10;
		}
		if(sum==num)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
		sc.close();

	}

}

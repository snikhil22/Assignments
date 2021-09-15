package CoreJava.basicDataStructure;

import java.util.Scanner;

public class dsQ7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fg=0;
		System.out.println("Enter value to search");
		int val=sc.nextInt();
		int arr[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		for(int i=0;i<15;i++)
		{
			if(arr[i]==val)
			{
				System.out.println("Number found at index "+i);
				fg=1;
				break;
			}
		}
		if(fg==0)
			System.out.println("Number not found");
	}

}

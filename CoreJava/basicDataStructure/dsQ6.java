package CoreJava.basicDataStructure;

import java.util.Scanner;

public class dsQ6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int count=2;
		System.out.println("Enter user id");
		String user_id=sc.next();
		String pass="";
		main:
		while(true) {
			if(user_id.equals("admin")) {	
					while(count>=0) {
						System.out.println("Enter password:");
						pass=sc.next();
						if(pass.equals("1234")) {
							System.out.println("Welcome "+user_id);
							break main;
						}
						else 
							System.out.println("Wrong Passwords.Attempts remaining:"+count);
						count--;
						}
					System.out.println("Contact Admin");
					break;
					}
			else {
				System.out.println("User doesn't exist");
				break;
			}
		}

	}

}

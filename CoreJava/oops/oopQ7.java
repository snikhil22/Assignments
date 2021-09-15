package CoreJava.oops;
import java.util.Scanner;

abstract class DessertItem{
    public int iceCreamCount;
    public int candyCount;
    public int cookieCount;
    public String user;

    public DessertItem(int iceCreamCount,int candyCount,int cookieCount,String user){
        this.iceCreamCount=iceCreamCount;
        this.candyCount=candyCount;
        this.cookieCount=cookieCount;
        this.user=user;

    }
    
    public String setIcreamCount(int iceCream){
        if(user=="owner"){
            iceCreamCount = iceCream;
            return "updated";
        }
        else{
            return "Access Denied";
        }
    }
    
    public String setCandyCount(int candy){
        if(user=="owner"){
            candyCount = candy;
            return "Updated";
        }
        else{
            return "Access Denied";
        }
    }
    
    public String setCookieCount(int iceCream){
        if(user=="owner"){
            cookieCount = iceCream;
            return "Updated";
        }
        else{
            return "Access Denied";
        }
    }

}

class Owner extends DessertItem{

    public Owner(int iceCreamCount, int candyCount, int cookieCount, String user) {
        super(iceCreamCount, candyCount, cookieCount, user);

        
    }

}

class Customer extends DessertItem{
    public Customer(int iceCreamCount, int candyCount, int cookieCount, String user) {
        super(iceCreamCount, candyCount, cookieCount, user);
        
    }
    public int getBill(int iceCreamCount, int candyCount, int cookieCount){
        System.out.print("Your Order bill for: "+iceCreamCount+" Ice Creame "+candyCount+" Candie "+cookieCount+" Cookie "+"is: ");
        return iceCreamCount*50+candyCount*60+cookieCount*70;
    }
}

public class oopQ7 {
	public static void main(String[] args) {
		  Scanner us = new Scanner(System.in);
          System.out.println("Who are you Owner or Customer");
          String user = us.nextLine();
          if(user.equals("owner")){System.out.println("Welcome Back Owner");
          Owner o = new Owner(50, 40, 30, user);
          o.setCandyCount(o.candyCount);
          o.setIcreamCount(o.iceCreamCount);
          o.setCookieCount(o.cookieCount);
          }
          else{
              System.out.println("Please Visit Us Again: "+user);
              Customer customer = new Customer(1, 2, 0, user);
              System.out.println(customer.getBill(customer.iceCreamCount, customer.candyCount, customer.cookieCount));
          }
          

	}

}

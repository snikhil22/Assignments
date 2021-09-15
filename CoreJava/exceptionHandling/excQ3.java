package CoreJava.exceptionHandling;

class IllegalBankTransactionException extends Exception{
	public IllegalBankTransactionException() {
		super("Amount is not valid");
	}
}
class InsufficienBalanceException extends Exception{
	public InsufficienBalanceException() {
		super("Account balance low");
	}
}
class SavingAccount{
	long id;
	double bal;
	
	public SavingAccount(long id, double bal) {
		super();
		this.id = id;
		this.bal = bal;
	}
	
	public double withdraw(double amt) throws InsufficienBalanceException,IllegalBankTransactionException{
		if(amt<0)
			throw new IllegalBankTransactionException();
		else if(amt>bal)
			throw new InsufficienBalanceException();
		else {
			bal-=amt;
			return bal;
		}
	}
	public double deposit(double amt) {
		bal+=amt;
		return bal;
	}
}
public class excQ3 {
	public static void main(String[] args) {
		SavingAccount sa=new SavingAccount(1,1000);
		try {
			System.out.println("balance left : "+sa.withdraw(20000));
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}

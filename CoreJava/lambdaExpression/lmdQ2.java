package CoreJava.lambdaExpression;

@FunctionalInterface
interface MyLambda{
	public void perform();
}

enum Status{
	INITIALIZED,ACCEPTED,COMPLETED;
}
class Order{
	int id;
	int price;
	Status st;
	
	public Order(int id, int price, Status st) {
		super();
		this.id = id;
		this.price = price;
		this.st = st;
	}
	
	@Override
	public String toString() {
		return id + "/t" + price + "/t" + st;
	}
	
	
	
}
public class lmdQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

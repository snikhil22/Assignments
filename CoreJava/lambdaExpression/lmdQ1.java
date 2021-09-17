package CoreJava.lambdaExpression;

@FunctionalInterface
interface Calculate{
	public int perform(int x,int y);
}

public class lmdQ1 {

	public static void main(String[] args) {

		int a=6,b=3;
		Calculate add=(x,y)->x+y;
		Calculate sub=(x,y)->x-y;
		Calculate mul=(x,y)->x*y;
		Calculate div=(x,y)->x/y;
		System.out.println("Addition : "+add.perform(a,b));
		System.out.println("Subtraction : "+sub.perform(a,b));
		System.out.println("Multiplication : "+mul.perform(a,b));
		System.out.println("Division : "+div.perform(a,b));

	}

}

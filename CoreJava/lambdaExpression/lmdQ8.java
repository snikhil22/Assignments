package CoreJava.lambdaExpression;

import java.util.ArrayList;

public class lmdQ8 {

	public static void main(String[] args) {

			ArrayList<Integer> a=new ArrayList<>();
			a.add(10);
			a.add(20);
			a.add(30);
			a.add(40);
			a.add(50);
			a.add(60);
			Thread lmd= new Thread(()->a.forEach(num->System.out.println(num)));
			lmd.run();	

	}

}

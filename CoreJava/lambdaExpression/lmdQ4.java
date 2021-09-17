package CoreJava.lambdaExpression;

import java.util.ArrayList;

public class lmdQ4 {

	public static void main(String[] args) {
		ArrayList<String> ani=new ArrayList<>();
		ani.add("dog");
		ani.add("elephant");
		ani.add("zebra");
		ani.add("lion");
		ani.add("jaguar");
		ani.add("tiger");
		ani.add("hyena");
		ani.add("monkey");
		
		ani.removeIf(animal->animal.length()%2!=0);
		
		System.out.println("After removing odd length elements");
		for(String s:ani)
			System.out.println(s);
	}

}

package CoreJava.lambdaExpression;

import java.util.ArrayList;

public class lmdQ6 {

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
		
		ani.replaceAll(str->str.toUpperCase());

		System.out.println("After replacing every element with its upper case equivalent");
		for(String s:ani)
			System.out.println(s);
	}

}

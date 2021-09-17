package CoreJava.lambdaExpression;

import java.util.ArrayList;
import java.util.function.Consumer;

public class lmdQ5 {

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
		
		StringBuilder finalstr=new StringBuilder();
		
		Consumer<String> crtstr=s->finalstr.append(s.charAt(0));
		
		for(String s:ani)
			crtstr.accept(s);
			
		System.out.println("Final string : "+finalstr);		
	}

}

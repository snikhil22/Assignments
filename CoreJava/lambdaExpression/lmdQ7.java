package CoreJava.lambdaExpression;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class lmdQ7 {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
		m.put(1,"lion");
		m.put(2,"tiger");
		m.put(3,"hyena");
		m.put(4,"jaguar");
		m.put(5,"monkey");
		m.put(6,"zebra");
		m.put(7,"elephant");
		m.put(8,"dog");

		StringBuilder finalstr=new StringBuilder();
		
		Consumer<Map.Entry<Integer,String>> crtstr= a->finalstr.append(a.getKey()+a.getValue());
		
		for(Map.Entry<Integer,String> e:m.entrySet())
			crtstr.accept(e);
		
		System.out.println("Final string : "+finalstr);	
	}

}

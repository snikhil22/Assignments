package CoreJava.generics;

import java.util.HashMap;
import java.util.Map;

public class genQ2 {

	public static void main(String[] args) {
		HashMap<Integer,Double> hash=new HashMap<>();
		hash.put(1,10.00);
		
		
		for(Map.Entry<Integer,Double> entry : hash.entrySet()) {
		System.out.println(entry.getKey()+"\t"+entry.getValue());
		}

	}

}

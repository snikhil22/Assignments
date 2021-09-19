package CoreJava.Java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class j11Q3 {

	public static void main(String[] args) {
		String s=new String("A quick brown fox jumps over the lazy dog");
		List<String> str= new ArrayList<>(Arrays.asList(s.split(" ")));
		Object[] newstr=str.toArray();
		for(Object sn: newstr)
		System.out.println(sn);
	}

}

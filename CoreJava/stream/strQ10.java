package CoreJava.stream;

import java.util.Arrays;
import java.util.List;


public class strQ10 {

	public static void main(String[] args) {
		
		List<Trader> t=Arrays.asList(
				new Trader("Akhandanand","Mirzapur"),
				new Trader("Beena","Delhi"),
				new Trader("Phoolchand","Indore"),
				new Trader("Bablu","Indore"),
				new Trader("Guddu","Indore"),
				new Trader("Sweety","Pune"),
				new Trader("Gajgamini","Pune"),
				new Trader("Dimpy","Pune"),
				new Trader("Lala","Pune"),
				new Trader("Shabnam","Pune"),
				new Trader("Ratishankar","Delhi"),
				new Trader("Sharad","Delhi"),
				new Trader("Lalit","Indore")			
				);
	
		t.stream().filter(p->p.getCity().equals("Pune")).sorted((x,y)->x.name.compareTo(y.name))
		.forEach(p-> System.out.println(p));

	}

}

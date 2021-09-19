package CoreJava.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Trader{
	String name;
	String city;
	
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return name + "\t" + city;
	}
	
	
}
public class strQ9 {

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
		
		 Map<String,List<Trader>> tMap = t.stream()
			        .collect(Collectors.groupingBy(Trader::getCity));

			        for(String s:tMap.keySet())
			        {
			            System.out.println(s);
			        }	
	}

}

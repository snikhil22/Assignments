package CoreJava.stream;

import java.util.Arrays;
import java.util.List;

public class strQ5 {

	public static void main(String[] args) {
		
		List<News> n=Arrays.asList(
				new News(18,"Lalit","Akhandanand","Budget is High"),
				new News(2,"Beena","Guddu","Fake news"),
				new News(18,"Lalit","Phoolchand","Budget is Low"),
				new News(18,"Lalit","Bablu","Can't say anything"),
				new News(18,"Lalit","Guddu","Budget is on Top"),
				new News(2,"Beena","Akhandanand","News is true"),
				new News(10,"Lala","Akhandanand","Too low Budget"),
				new News(5,"Dimpy","Guddu","Lions of Mirzapur"),
				new News(10,"Lala","Sharad","We can afford"),
				new News(5,"Dimpy","Gajgamini","Budget Budget Budget"),
				new News(10,"Lala","Guddu","Yess, we can"),
				new News(18,"Lalit","Sharad","No opinion"),
				new News(2,"Beena","Phoolchand","News is not fake")			
				);
		
		  long c = n.stream()
			        .filter(p -> p.getComment().toUpperCase().contains("BUDGET")).count();
			        
			        System.out.println("budget is present in "+c+" news");
	}

}

package CoreJava.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class strQ6 {

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
		
		 Map<String,List<News>> newsMap = n.stream()
			        .collect(Collectors.groupingBy(News::getCommentByUser));

			        int max_com = 0; String user = "";
			        for(String s:newsMap.keySet())
			        {
			            if(newsMap.get(s).size()>max_com)
			            {
			                max_com = newsMap.get(s).size();
			                user = s;
			            }
			        }
			        System.out.println(user+" have posted maximum comments");
			        
	}

}

package CoreJava.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class News{
	int newsId;
	String postedByUser;
	String commentByUser;
	String comment;
	
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return newsId + "\t" + postedByUser + "\t" + commentByUser+ "\t" + comment;
	}
}

public class strQ4 {

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
		
		Map<Integer,List<News>> newsMap = n.stream()
			        .collect(Collectors.groupingBy(News::getNewsId));

			        int id = 0, max_com = 0;
			        for(Integer i:newsMap.keySet())
			        {
			            if(newsMap.get(i).size()>max_com)
			            {
			                max_com = newsMap.get(i).size();
			                id = i;
			            }
			        }
			        System.out.println("NewsId - "+id+" has maximum comments");

	}

}

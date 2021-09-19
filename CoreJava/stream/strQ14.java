package CoreJava.stream;

import java.util.Arrays;
import java.util.List;

public class strQ14 {

	public static void main(String[] args) {

		List<Transaction> t=Arrays.asList(
				new Transaction("Akhandanand","Mirzapur",2011,100000),
				new Transaction("Beena","Delhi",2010,50000),
				new Transaction("Phoolchand","Indore",2011,70000),
				new Transaction("Bablu","Indore",2011,60000),
				new Transaction("Guddu","Indore",2011,90000),
				new Transaction("Sweety","Pune",2008,30000),
				new Transaction("Gajgamini","Pune",2009,80000),
				new Transaction("Dimpy","Pune",2010,40000),
				new Transaction("Lala","Pune",2009,55000),
				new Transaction("Shabnam","Pune",2009,25000),
				new Transaction("Ratishankar","Delhi",2008,95000),
				new Transaction("Sharad","Delhi",2008,75000),
				new Transaction("Lalit","Indore",2010,200000)			
				);
		
		Transaction tt=t.stream().max((x,y)->x.getVal()-y.getVal()).get();
		System.out.println("Highest transaction value : "+tt.getVal());
	}

}

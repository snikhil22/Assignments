package CoreJava.collections;

import java.sql.Date;
import java.time.Year;
import java.util.LinkedList;

public class colQ4 {

	public static void main(String[] args) {
	LinkedList<Date> d=new LinkedList<>();
	d.add(new Date(2008,8,15));
	d.add(new Date(2012,3,21));
	d.add(new Date(2003,5,5));
	
	for(Date date: d) {
		if(Year.of(date.getYear()).isLeap())
		System.out.println("date is a leap year");
		else
			System.out.println("date is not a leap year");
	}
	
	}

}

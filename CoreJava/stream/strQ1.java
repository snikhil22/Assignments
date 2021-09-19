package CoreJava.stream;

import java.util.Arrays;
import java.util.List;

class Fruit{
	String name;
	int cal;
	int prc;
	String clr;
	
	public Fruit(String name, int cal, int prc, String clr) {
		super();
		this.name = name;
		this.cal = cal;
		this.prc = prc;
		this.clr = clr;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCal() {
		return cal;
	}

	public void setCal(int cal) {
		this.cal = cal;
	}

	public int getPrc() {
		return prc;
	}

	public void setPrc(int prc) {
		this.prc = prc;
	}

	public String getClr() {
		return clr;
	}

	public void setClr(String clr) {
		this.clr = clr;
	}

	@Override
	public String toString() {
		return name + "\t" + cal + "\t" + prc + "\t" + clr;
	}	
}

public class strQ1 {
	public static void main(String[] args) {
		
		List<Fruit> f=Arrays.asList(
				new Fruit("Apple",52,120,"Red"),
				new Fruit("Mango",60,60,"Yellow"),
				new Fruit("Strawberry",33,150,"Red"),
				new Fruit("Banana",102,50,"Yellow"),
				new Fruit("Pumpkin",26,70,"Orange"),
				new Fruit("Pineapple",110,70,"Green"));
		
		f.stream().filter(p->p.cal<100).forEach(p-> System.out.println(p));

	}

}

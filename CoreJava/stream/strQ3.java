package CoreJava.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class strQ3 {

	public static void main(String[] args) {
		
		List<Fruit> f=Arrays.asList(
				new Fruit("Apple",52,120,"Red"),
				new Fruit("Mango",60,60,"Yellow"),
				new Fruit("Strawberry",33,150,"Red"),
				new Fruit("Banana",102,50,"Yellow"),
				new Fruit("Pumpkin",26,70,"Orange"),
				new Fruit("Pineapple",110,70,"Green"));

		f.stream().filter(p->p.getClr()=="Red").sorted(Comparator.comparingInt(Fruit::getPrc))
				.collect(Collectors.toList()).forEach(p-> System.out.println(p));
		
	}

}

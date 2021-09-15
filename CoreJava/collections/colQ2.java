package CoreJava.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Product{
	int id;
	String name;
	
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + "\t" + name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id && Objects.equals(name, other.name);
	}	
	
	
}

public class colQ2 {
		public static void main(String args[]) {
			
			Set<Product> set=new HashSet<>();
			
			Product p1=new Product(1,"Milk");
			Product p2=new Product(2,"Cheese");
			Product p3=new Product(1,"Milk");
			Product p4=new Product(2,"Cheese");
			Product p5=new Product(3,"Butter");
			set.add(p1);
			set.add(p2);
			set.add(p3);
			set.add(p4);
			set.add(p5);
			
			Iterator itr=set.iterator();
			while(itr.hasNext()) {
			System.out.println(itr.next());
			}
			
		}
}

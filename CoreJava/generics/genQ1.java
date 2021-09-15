package CoreJava.generics;
import java.util.HashSet;


class Employee{
	private int id;
	private String name;
	private int sal;
	private String dept;
	
	
	public Employee(int id, String name, int sal, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.dept = dept;
	}


	public void displayDetails() {
		System.out.println(id+"\t"+name+"\t"+sal+"\t"+dept);
	}
	
}
public class genQ1 {

	public static void main(String[] args) {
		HashSet<Employee> set=new HashSet<>();
		Employee e1=new Employee(1,"Ravi",100,"IT");
		Employee e2=new Employee(2,"Shyam",200,"HR");
		set.add(e1);
		set.add(e2);

		for(Employee e:set)
		e.displayDetails();;
	}

}

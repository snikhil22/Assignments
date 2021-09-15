package CoreJava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	String dept;
	int sal;
	
	public Employee(int id, String name, String dept, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return id + "\t" + name + "\t" + dept + "\t" + sal;
	}
	
	@Override
	public int compareTo(Employee o) {
		if(this.id==o.id)
		return 0;
		else if(this.id>o.id)
			return 1;
		else return -1;
	}
}
public class colQ3 {

	public static void main(String[] args) {
		Set<Employee> t1=new TreeSet<>();
		
		Employee e1=new Employee(1,"Raj","it",200);
		Employee e2=new Employee(2,"Syaam","dev",400);
		Employee e3=new Employee(3,"Amit","staff",600);
		Employee e4=new Employee(4,"Jaidev","hr",100);

		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		
		List<Employee> l1=new ArrayList<>(t1);
		System.out.println("Select on which basis you want to sort the data");
		System.out.println("1) ID");
		System.out.println("2) Name");
		System.out.println("3) Department");
		System.out.println("4) Salary");
		
		Scanner sc=new Scanner(System.in);
		int op=sc.nextInt();
		
		switch(op) {
		case 1 : Collections.sort(l1, new Comparator<Employee>(){
			@Override
			public int compare(Employee o1,Employee o2){
				 return o1.id-o2.id;
			}	
		});
			break;
		case 2 : Collections.sort(l1, new Comparator<Employee>(){
			@Override
			public int compare(Employee o1,Employee o2){
				return o1.name.compareTo(o2.name);
				}
		});
			break;
		
		case 3 : Collections.sort(l1, new Comparator<Employee>(){
			@Override
			public int compare(Employee o1,Employee o2){
				return o1.dept.compareTo(o2.dept);
			}	
		});
			break;
			
		case 4 : Collections.sort(l1, new Comparator<Employee>(){
			@Override
			public int compare(Employee o1,Employee o2){
			 return o1.sal-o2.sal;
			}	
		});
			break;
			
		default : System.out.println("Wrong input!!!");
		}
	Iterator<Employee> itr=l1.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}

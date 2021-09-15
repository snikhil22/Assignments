package CoreJava.oops;

class Employee{
	int id;
	String name;
	int basal;
	
	public Employee(int id, String name, int basal) {
		super();
		this.id = id;
		this.name = name;
		this.basal = basal;
	}
	
	int calcTotalSal() {
		return basal;
	}	
}

class Manager extends Employee{
	int inct;

	public Manager(int id, String name, int basal, int inct) {
		super(id, name, basal);
		this.inct = inct;
	}
	
	int calcTotalSal() {
		return basal+inct;
	}	
}

class Labour extends Employee{
	int ot;

	public Labour(int id, String name, int basal, int ot) {
		super(id, name, basal);
		this.ot = ot;
	}
	
	int calcTotalSal() {
		return basal+ot;
	}	
}
public class oopQ2 {

	public static void main(String[] args) {
	
		Manager m1=new Manager(1,"Ram",100,10);
		System.out.println(m1.calcTotalSal());
		
		Labour l1=new Labour(2,"Shyaam",200,20);
		System.out.println(l1.calcTotalSal());
		
		Employee e1=new Employee(3,"Balram",300);		
		System.out.println(e1.calcTotalSal());
	}

}

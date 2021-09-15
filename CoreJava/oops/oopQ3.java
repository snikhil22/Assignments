package CoreJava.oops;

class Bank{
     String name;
     int accNo;
     int mainBal;
   
    public Bank(String name,int accNo,int mainBal){
        this.name=name;
        this.accNo=accNo;
        this.mainBal=mainBal;
    }
    public int totalCash(){
        return mainBal;
    }
}

class Savings extends Bank{
    private int fd;
   
    public Savings(String name,int accNo,int mainBal,int fd){
        super(name,accNo,mainBal);
        this.fd=fd;
    }
    public int totalCash(){
        return fd+mainBal;
    }

}

class Current extends Bank{
	private int cc;
   
	public Current(String name,int accNo,int mainBal,int cc){
        super(name,accNo,mainBal);
        this.cc=cc;
    }
    public int totalCash(){
        return cc+mainBal;
    }
}


public class oopQ3 {
	public static void main(String[] args) {
		
		 Savings sb = new Savings("Ram",1,100,10);
	     System.out.println(sb.totalCash());

	     Current cr = new Current("Shyaam",2,200,20);
	     System.out.println(cr.totalCash());
	}

}



  

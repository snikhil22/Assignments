package CoreJava.oops;

abstract class Persistence{
    abstract String persist();
}

class FilePersistence extends Persistence{
    public String persist(){
        return "File";
    }
}

class DatabasePersistence extends Persistence{
   public String persist(){
        return "DataBase";
    }
}

public class oopQ6 {
	public static void main(String[] args) {
		   Persistence obj = new FilePersistence();
	       System.out.println(obj.persist()); 
	}
}
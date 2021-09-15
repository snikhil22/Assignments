package CoreJava.generics;


class Pair<T1,T2>{
	T1 key;
	T2 value;
	
	public T1 getKey() {
		return key;
	}
	public T2 getValue() {
		return value;
	}
	public void setKey(T1 key) {
		this.key = key;
	}
	public void setValue(T2 value) {
		this.value = value;
	}
}
public class genQ4 {

	 public static void main(String[] args) {
		
		Pair<String,String> P1=new Pair<>();
		P1.setKey("1");
		P1.setValue("one");
		System.out.println(P1.getKey()+"\t"+P1.getValue());
		
		Pair<String,java.util.Date> P2=new Pair<>();
		P2.setKey("1");
		P2.setValue(new java.util.Date());
		System.out.println(P1.getKey()+"\t"+P1.getValue());
		

	}

}

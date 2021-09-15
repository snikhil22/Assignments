package CoreJava.generics;

class Swap{
public static <T> void swap(T[] ar,int i, int j){
	T temp=ar[i];
	ar[i]=ar[j];
	ar[j]=temp;
}
}

public class genQ3 {

	public static void main(String[] args) {
		
		String[] arr= {"aa","bb","cc","dd","ee","ff"};
		Swap.swap(arr,1,3);
		for(String s:arr)
		System.out.println(s);
		
	}

}

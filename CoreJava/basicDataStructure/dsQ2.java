package CoreJava.basicDataStructure;

public class dsQ2 {

	public static void main(String[] args) {
		int temp,a,sum;
		for(int i=100;i<=999;i++)
		{
			temp=i;
			sum=0;
			while(temp>0)
			{
				a=temp%10;
				sum+=(a*a*a);
				temp/=10;
			}
			if(sum==i)
				System.out.println(i);
		}
	}

}

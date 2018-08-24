public class LargestPrimeFactor {

	public static void main(String[] args) {
		long  a= 600851475143L;
		long fact=0;
		while(a%2==0)
		{
			fact=2;
			a/=2;
		}
		for(int i=3;i<Math.sqrt(a);i+=2)
		{
			if(a%i==0)
			{
				 a/=i;
				 fact=i;
			}	
		}
		if(a>2)
			System.out.println(a);
	}

}

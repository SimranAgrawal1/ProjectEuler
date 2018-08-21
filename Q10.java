public class SummationOfPrimes {

	public static void main(String[] args) {
		long sum=0;
		long num=2000000;
		for(long n=2;n<num;n++)
		{
			int c=1;
			for(int i=2;i<=Math.sqrt(n);i++)
			{
				if(n%i==0)
				{
					c++;
				}
			}
			if(c==1)
				sum=sum+n;
		}
		System.out.println("Sum is:"+sum);
	}
}

public class SumSquareDifference {

	public static void main(String[] args) {
		int sum1=0,sum2=0,diff=0,s2=0;
		for(int i=1;i<=100;i++)
		{
			int val=i*i;
			sum1=sum1+val;
			s2=s2+i;
		}
		sum2=s2*s2;
		System.out.println("The sum of the squares is:"+sum1);
		System.out.println("The square of the sum is:"+sum2);
		diff=sum2-sum1;
		System.out.println("Difference is:"+diff);

	}

}

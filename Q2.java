public class Q2
{
	public static void main(String[] args)
  {
		int a=1,b=2,sum=2;
		System.out.print(a+" "+b);
		while(a<4000000 && b<4000000)
		{
			a=a+b;
			b=a+b;
			if(a<4000000 && b<4000000)
			{
				System.out.print(" "+a+" "+b);
				if(a%2==0)
					sum=sum+a;
				else if(b%2==0)
					sum=sum+b;
			}
		}
		System.out.println("\nSum="+sum);
	}

}

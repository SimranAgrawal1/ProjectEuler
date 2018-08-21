public class LargestPallindrome {
	public static void main(String[] args) {
		int pro=0,max=0;
		boolean bool=true;
		for(int i=999;i>=100;i--)
		{
			for(int j=999;j>=100;j--)
			{
				pro=i*j;
				bool=IsPallindrome(pro);
				if(bool)
				{
					if(pro>max)
					{
						max=pro;
						break;
					}
				}
			}
		}
		System.out.println(max);
	}
	static boolean IsPallindrome(int val)
	{
		int rev=0;
		int s=val;
		while(s!=0)
		{
			int rem=s%10;
			rev=rev*10+rem;
			s=s/10;
		}
		if(val==rev)
			return true;
		else
			return false;
	}


}

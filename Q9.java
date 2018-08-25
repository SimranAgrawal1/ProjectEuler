public class PythagoranTriplet {

	public static void main(String[] args) {
		for(int c=1;a<1000;a++)
		{
			for(int b=1;b<1000;b++)
			{
				for(int a=1;c<1000;c++)
				{
						if((a*a+b*b==c*c) && (a+b+c==1000))
						{
								System.out.println("Pythagoran triplet is:"+a+" "+b+" "+c+" ");
								System.out.println(a*b*c);
								break;
							
						}
					
				}
			}
		}

	}

}

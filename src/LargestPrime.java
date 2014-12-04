
public class LargestPrime {
	
	public static void main(String[] args) {
		long l=600851475143L;
		long f=1L;
		while(f<l)
		{
			f=subFactor(l);
			l=l/f;
		}
		System.out.println(f);
	}
		
		static long subFactor(long f)
		{
			for(long x=2L;x<=f ;x++ )
				if(f%x == 0)
					return x;
			
			return f;
		}
		
	

}

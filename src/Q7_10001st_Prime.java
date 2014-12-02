// Find 10001 st  Prime Number

public class Q7_10001st_Prime 
{
	public static void main(String[] args) 
	{
		Q3_primeFactors obj=new Q3_primeFactors();
		
		Timer t=new Timer();
		int primeNosCount=0; long i;
		for(i=2L;primeNosCount<=(10001-1);i++)
			if(obj.checkPrime(i))
				primeNosCount++;
		
		System.out.println(--i);
		
		t.getRunTime();

	}

}

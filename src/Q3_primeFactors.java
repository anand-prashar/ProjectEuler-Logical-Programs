/* What is the largest prime factor of the number 600851475143 ?  */

public class Q3_primeFactors 
{
	public static void main(String[] args) 
	{
		long limit= 1000070000;
					//600851475143L
		Q3_primeFactors obj=new Q3_primeFactors();
		obj.solution(limit);
	}
	
	void solution(long limit)
	{
		long divisor=2L,largestPrimeDiv=0L,divident;
		
		divident=limit;
		//limit/=2;
		
		while(divisor<=limit)
		{
			if(divident%divisor == 0)  
			  if(checkPrime(divisor))
			  {
				largestPrimeDiv=divisor;
			  }
			divisor++;
		}
		System.out.println("Largest Prime Divisor="+largestPrimeDiv);
	}

    private boolean checkPrime(long divident) 
	{
		int divisorCount=0;
		
		for(long div=1L;div<=divident;div++)
			if(divident%div==0)
				divisorCount++;
		if(divisorCount==2)
			return true;
		else
			return false;
	}

}

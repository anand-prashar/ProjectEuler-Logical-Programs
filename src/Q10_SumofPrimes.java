// Find the sum of all the primes below two million

public class Q10_SumofPrimes 
{
	public static void main(String[] args) 
	{
		Q10_SumofPrimes o=new Q10_SumofPrimes();
		Timer t= new Timer();
		o.solution();
		//System.out.println(Q3_primeFactors.checkPrime_Logic2(15));
		t.getRunTime();
	}
	
	void solution()
	{
		Q3_primeFactors p=new Q3_primeFactors();
		
		int limit=2000000;
		long sumofPrimes=0;
		Integer[] primeCutterChart= new Integer[limit+1];
		Integer zero=new Integer(0);
		
		for(int i=0;i<=limit;i++)
			primeCutterChart[i] = new Integer(i);
		
		//printChart(primeCutterChart);
		
		for(int i=0;i<=limit;i++)
		{
			if( primeCutterChart[i] != zero )
			   if(p.checkPrime(i))
			   {
				   //System.out.println(i);
				   sumofPrimes+=i;
				   deleteAllFactorsof(i,primeCutterChart);
				   //printChart(primeCutterChart);
			   }
		}
		System.out.print("\n\nSum of Primes = "+sumofPrimes);
		
	}

	private void deleteAllFactorsof(int prime, Integer[] primeCutterChart) 
	{
		Integer zero=new Integer(0);
		for (int i=2; (i*prime) < primeCutterChart.length; i++)
		{
			primeCutterChart[i*prime]=zero;
		}
	}
	
/*	private void printChart(Integer[] primeCutterChart)
	{
		System.out.println();
		for (int i=0;i<primeCutterChart.length;i++)
			System.out.print(primeCutterChart[i] + " ");
	}*/

}
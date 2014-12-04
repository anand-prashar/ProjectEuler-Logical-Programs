
public class Q12_LargeTriangleNumber 
{
	public static void main(String[] args) 
	{
		Q12_LargeTriangleNumber o =new Q12_LargeTriangleNumber();
		Timer t=new Timer();
		o.solution(100);
		
		t.getRunTime();
		//System.out.println(o.getFactorCountOf(28));
	}

    void solution(int expectedNoOfDivisors)
    {
    	long triangeNos=0L;
    	int noOfFactors=0,i;
    	
    	for(i=1; noOfFactors<expectedNoOfDivisors ;i++)
    	{
    		triangeNos+=i;
    		System.out.print(triangeNos+ " ");
    		noOfFactors=getFactorCountOf(triangeNos);
    		
    	}
    	System.out.print("\n\nFirst Triangle no(with "+noOfFactors+" factors ) = "+triangeNos);
    }

	private int getFactorCountOf(long triangeNos) 
	{
		int noOfDivisor=1;
		
		for(int i=2; i<=triangeNos; i++)
		while(triangeNos%i == 0)
		{
			triangeNos/=i;
			noOfDivisor++;
		}
		
		return ++noOfDivisor;
	}
}

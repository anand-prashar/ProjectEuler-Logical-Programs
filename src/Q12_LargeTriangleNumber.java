
public class Q12_LargeTriangleNumber 
{
	Timer t=new Timer();
	public static void main(String[] args) 
	{
		Q12_LargeTriangleNumber o =new Q12_LargeTriangleNumber();
		
		o.solution(500);
		
		o.t.getRunTime();
		
		//System.out.println(o.getFactorCountOf(28));
	}

    void solution(int expectedNoOfDivisors)
    {
    	long triangeNos=0L;
    	int noOfFactors=0,i, dummyLog=0,maxFactorsoFar=0;
    	
    	for(i=1; noOfFactors<expectedNoOfDivisors ;i++)
    	{
    		//this.t.resetTimer();
    		triangeNos+=i;
    		//System.out.println(triangeNos+ " ");
    		
    		dummyLog=getFactorCountOf(triangeNos);
    		if(noOfFactors!=dummyLog)
    		{
    			if(maxFactorsoFar<dummyLog) maxFactorsoFar=dummyLog;
    			System.out.print(maxFactorsoFar+" factors hightest so Far. Current No="+triangeNos+ " -- ");
    			this.t.getRunTime();
    		}
    		noOfFactors=dummyLog;
    		
    	}
    	System.out.print("\n\nFirst Triangle no(with "+noOfFactors+" factors ) = "+triangeNos);
    }

	private int getFactorCountOf(long triangeNo) 
	{
		int noOfDivisor=1;
		if(triangeNo!=1) noOfDivisor++;  // 1 & self
		
		for(int i=2; i<=triangeNo/2; i++)
			if(triangeNo%i == 0)
			{
				//while(triangeNo%i == 0)
					  //triangeNo/=i;
				noOfDivisor++;
			}
		return noOfDivisor;
	}
}

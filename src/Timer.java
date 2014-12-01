
public class Timer 
{
	private long startTime,endTime;
	
	Timer()
	{
		startTime = System.currentTimeMillis();
	}
	
	void getRunTime()
	{
		endTime = System.currentTimeMillis();
		System.out.println("\n\n" + (endTime-startTime)+ "- milliseconds Runtime"  );
	}
}

/*in the Fibonacci sequence whose values do not exceed 4000000, 
find the sum of the even-valued terms.
*/

public class Q2_evenFiboSum 
{
	public static void main(String[] args)
	{
		Q2_evenFiboSum obj= new Q2_evenFiboSum();
		
		obj.solution(4000000);

	}
	
	void solution(int limit)
	{
		int f=0,s=1,t,sum=0;
		
		while(s<=limit)
		{
			t=f+s;
			if(s%2==0) sum+=s;
			
			f=s;
			s=t;
			
		}
		System.out.println("Sum = "+sum);
	}

}


/* Find the sum of all the multiples of 3 or 5 below 1000 */

public class Q1_Multiple_of_3_and_5 
{
	public static void main(String[] args) 
	{
		Q1_Multiple_of_3_and_5 obj=new Q1_Multiple_of_3_and_5();
		
		obj.solution(1000);

	}

	void solution(Integer no)
	{
		int sum=0;
		for(int i=1;i<no;i++)
		{
			if(i%5==0)
				sum+=i;
			if(i%3==0 && !(i%5==0))
				sum+=i;
		}
		System.out.println("Sum = "+sum);
	}
}

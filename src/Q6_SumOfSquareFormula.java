/*Find the difference between the sum of the squares of 
the first one hundred natural numbers and the square of the sum.
*/

public class Q6_SumOfSquareFormula 
{
	public static void main(String[] args) 
	{
		//Integer[] numList= {1,2,3,4,5,6,7,8,9,10};
		Integer[] numList=new Integer[100];
		for(int i=1;i<=100;i++) numList[i-1]=i;
		
		Timer t=new Timer();
		
		Q6_SumOfSquareFormula o=new Q6_SumOfSquareFormula();

		o.solution(numList);
		
		t.getRunTime();
	}
	
	private void solution(Integer[] ua)
	{
		long sumOfSquares=0, squareOfSum=0;
		for(Integer i:ua)
		{
			sumOfSquares+=Math.pow(i, 2);
			squareOfSum+=i;
		}
		squareOfSum=(int)Math.pow(squareOfSum, 2);
		System.out.println("Difference = "+(squareOfSum-sumOfSquares));
	}

}

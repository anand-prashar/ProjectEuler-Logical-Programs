/*Find the largest palindrome made from the product of two 3-digit numbers.  */


public class Q4_LargestPalindrome 
{
	public static void main(String[] args) 
	{
		Q4_LargestPalindrome o = new Q4_LargestPalindrome();
		Timer t=new Timer();
		o.solution();
		
		t.getRunTime();
	}
	
	private void solution()
	{
		int maxLimit,minLimit,number;
		
		for(maxLimit=999;maxLimit>=100;maxLimit--)
			for(minLimit=999;minLimit>=100;minLimit--)
			{
				number = maxLimit*minLimit;
				if(checkPalindrome(number))
				{
					System.out.println(number+" = "+maxLimit+" x "+minLimit);
					maxLimit=0;
					break;
				}
			}
		
	}

	boolean checkPalindrome(int data) 
	{
		String s= Integer.toString(data);
		int len=s.length();
		for(int low=0,high=len-1;low<=high;low++,high--)
			if(s.charAt(low) != s.charAt(high))
				return false;

		return true;		
}

}

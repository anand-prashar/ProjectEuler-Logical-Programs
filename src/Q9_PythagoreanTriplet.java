/* There exists exactly one Pythagorean triplet a2 + b2 = c2
for which a + b + c = 1000.
Find the product abc. */


public class Q9_PythagoreanTriplet 
{
	public static void main(String[] args) {
		Timer t=new Timer();
		for (int i=1;i<1000;i++){
		for(int j=i+1;j<1000;j++)
		{
		int k=1000-i-j;
		if(k>i && k>j && i*i + j*j == k*k){
		System.out.println("i is " + i +" " + "j is " + j +" " + "k is "+ k );
		System.out.println("LHS is "+ (i*i+j*j));
		System.out.println("RHS is "+ k*k);
		}

		}
		}
		t.getRunTime();
		}

}

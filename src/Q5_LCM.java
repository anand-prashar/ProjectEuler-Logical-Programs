public class Q5_LCM 
{
	public static void main(String[] args) 
	{
		Integer[] numList= {1,2,3,4,5,6,7,8,9,10};
		
		Timer t=new Timer();
		Q5_LCM o=new Q5_LCM();
		
		o.findLCM(numList);
		
		t.getRunTime();
	}
	
	void findLCM(Integer[] userList)
	{
		long lcm=1;
		Integer max=Integer.MIN_VALUE;
		
		//get max element from list, and print original List
		for(Integer itr:userList)
			{ if(max<itr) max=itr;
				System.out.print(itr + " ");
			
			}
		
		for(Integer i=2;i<=max;i++)  // start divisor from 2
			{
				if(checkAndDivideby(userList,i))
					{
						lcm = lcm*i;
						i--;         // maybe next time too, same common no is found as divisor
					}
				else
				    {
					  if(i>=max)
					  {
						  for(Integer itr:userList)
							  lcm = lcm*itr;    // final step
						  break;
					  }
				    }
					
		}
			System.out.print("\n\nLCM = "+lcm);
		
	}
	
	private boolean checkAndDivideby(Integer [] userList, Integer divisor)
	{
		Integer divisibleNosCount=0;
		for(Integer itr:userList)
				if(itr%divisor==0)
					divisibleNosCount++;
		
		// if 2 or more numbers in list can be divided by same no
		if (divisibleNosCount>=2)  
		{
			System.out.println();
			
			for(int index=0;index<userList.length;index++)
			{
				if(userList[index]%divisor==0)
					userList[index]/=divisor;            // divide
				System.out.print(userList[index] + " ");
			}
			System.out.print(" [by "+divisor+"]");
			
			
			return true;
		}		
			return false;	
	}

}

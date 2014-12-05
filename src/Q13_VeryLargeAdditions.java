
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Q13_VeryLargeAdditions 
{
	private String inputFileName="Q13_VeryLargeAdditions_INPUT.txt";
	private int noOfFileRows;
	String [] LargeNos;
	
	public static void main(String[] args) 
	{
		Q13_VeryLargeAdditions o = new Q13_VeryLargeAdditions();
		Timer t=new Timer();
		
		o.solution();
		t.getRunTime();
	}
	
	private void solution() 
	{
		LargeNos = getInputFile();  // FETCH ARRAY OF LARGE-NUMBER into that variable
		String output="";
		int sum=0,carry=0, 
			largestNoLength=getLargestofArray(); //length of largest no in Array
		
		
		//pad smaller numbers on left side with '0's
		check_and_repairArrayforLengthIssues(largestNoLength);
		
		for(int i=largestNoLength; i>0; i--)
		{
			for(String s: LargeNos)
				sum+=Integer.parseInt( s.substring(i-1, i) );
			
			sum+=carry;
			if( String.valueOf(sum).length()>1 )
			carry=Integer.parseInt( String.valueOf(sum).substring(0, String.valueOf(sum).length()-1) );
			
			output = String.valueOf(sum).substring(String.valueOf(sum).length()-1, String.valueOf(sum).length()) + output;
			sum=0; // reset for another Column
		}
		
		output= String.valueOf(carry)+output;
		System.out.print("\n\nSum of above Numbers = \n\n"+output);
		
	}


	private String[] getInputFile()
	{
		int i=0; noOfFileRows=0; 
		BufferedReader br;
		
		try 
		{
			br = new BufferedReader(new FileReader(inputFileName));
			String sCurrentLine; 
			while ((sCurrentLine = br.readLine()) != null) 
					noOfFileRows++; // get no of lines in file 1st
			br.close();
		    
			// Now Read file data
			br = new BufferedReader(new FileReader(inputFileName));
			
			// Initialize array of that length
			LargeNos = new String[noOfFileRows]; 
			
			while ((sCurrentLine = br.readLine()) != null) 
			{
				LargeNos[i]=sCurrentLine;
				i++;
			}
		 
 
		} catch (IOException e) 
		{
			System.out.println("Failed to Find input File !\n\n");
			e.printStackTrace();
		} 
 
		return LargeNos;
	}
	
	private int getLargestofArray() 
	{
		int length=0;
		for(String s:LargeNos)
			if(length<s.length()) length = s.length(); 
		return length;
	}
	

	private void check_and_repairArrayforLengthIssues(int largestNoLength) 
	{
		for(int i=0;i<noOfFileRows;i++)
		{
			while(largestNoLength>LargeNos[i].length())
			{
				LargeNos[i]="0" + LargeNos[i];
			}
			System.out.println(LargeNos[i] + " +");
		}
		
	}


}

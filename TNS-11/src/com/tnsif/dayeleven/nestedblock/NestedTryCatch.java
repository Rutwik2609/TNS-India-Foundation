package com.tnsif.dayeleven.nestedblock;

public class NestedTryCatch {

	
	public static void check()
	{
		String str="TNS";
		int slength=str.length();  // int slength=3
		
		System.out.println("String length : "+ slength);
		
		String anotherString = null;  // length is 0
		
		int y=6;
		
		
		//outer try block 
		try
		{
			
			//Inner Try Block 
			try {
				System.out.println(str.charAt(y));  //str.charAt(6)
				
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.err.println("Index is put of bounds "+e.getMessage());
			}
			
			System.out.println("String length :"+ anotherString.length());
		}
		
		
		//outer catch block 
		catch (NullPointerException np)
		{
			System.err.println("Exception is thrown "+ np.getMessage());
		}
	}
}

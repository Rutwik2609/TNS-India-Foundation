package com.tnsif.dayeleven.trycatch;

public class UncheckedException {

	public static void main(String[] args) {
		
		int x[];
		try {
			x=new int[] { 1,2,3,4,5};  //index from 0-4
			System.out.println(x[5]);  // number located at index position 6
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Specified index does not exist."
					+ e.getMessage());
		}

	}

}

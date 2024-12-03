package com.tnsif.dayten.smultidimensionalDemo;


class MLArray
{
	static void printArray(int c[][])
	{
		System.out.println("Arrays Elements are as follows :");
		for(int i=0; i<c.length; i++)
		{
			for (int j=0; j<c[i].length;j++)
			{
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
	}
	
	
}




public class MultiDimArrayDemo {

	public static void main(String[] args) {

		int c[][]= { {12,45} , {10,40} , {5,7}, {10,40} , {5,7}};
		
		System.out.println("No of row in C array :"+ c.length);

		MLArray.printArray(c);
		
	}

}

package javacode;

public class Day_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		increment and decreament operator in java
		preincrement ++a
		postincrement a++
		predecrement  --a,
		postdecrement  a--;
		 */
		
		int a=3;
		int b=++a;
		System.out.println(a);
		System.out.println(b);
		
		int c=(--a)+(b++);
		System.out.println(c);
		
		int d=(a++)-(c)+(--b)+(--a)+(b--)-(c)+(a--);
		System.out.println(d);
		
		int a1=10;
		int b1=20;
		int x=10;
		++a1;
		int c1=++a1+b1+a1--;
		System.out.println(c1);
		
		int d1=(c1++)+a1+(b1--);
		System.out.println("the value of d1 is "+d1);
		
		//control statements----
		//decision making statements(if, else,else if,switch)
		//loop statements (for,while,do while,for each loop)
		//jump statements (break, continue)
		
		System.out.println("if else loop-----");
		int age=22;
		if(age>=18) {
			System.out.println("You can vote");
		}else {
			System.out.println("you can't vote");
		}
		
		//using ternary operater
		
		System.out.println("using ternary operater----");
		
		String  res= (age>=18)? "you can vote": "You can't vote";
		System.out.println(res);
		
		
		int val1=10;
		int val2=11;
		
		if(!(val1<val2)||(a==b)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//code to find Greatest value---------
		
		System.out.println("Greater value----");
		int x1=10,x2=98,x3=55;
		
		if((x1>x2) && (x1>x3)) {
			if(x1>x3) {
				System.out.println("Grater value is : "+ x1);
			}else {
				System.out.println("Greater value is : "+x2);
			}
		}else if(x2>x3) {
			System.out.println("Greater value is : "+x2);
		}else {
			System.out.println("Greater value is : "+ x3);
		}
		
		//loops 
		
		//for loop -------
		System.out.println("for loop------");
		
		for(int i=0; i<=5; i++) {
			System.out.println(i+" ");
		}
		
		//while loop------
		System.out.println("while loop------");
		
		int i=1;
		while(i<=5) {
			System.out.println(i+" ");
			i++;
		}
		
		//do while loop-----
		System.out.println("do while loop------");
		
		int j=1;
		do {
			System.out.println("hello"+" ");
			j++;
		}while(j<=5);
		
		//for each loop-----
		System.out.println("for each loop-------");
		
		int[] arr= {1,2,3,4,5,6};
		for (int k : arr) {
			
			System.out.println(k+" ");
		}
		
		//multiplication table
		System.out.println("multiplication table (10 to 20");
		int beg=10;
		int end=20;
		
		for(int m=beg; m<=end; m++) {
			for(int n=1; n<=10; n++) {
				System.out.print(m*n+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}

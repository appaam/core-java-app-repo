package com.sapient.aem.ui;

public class PowerOfTwo {
	
	static boolean checkNumber(int n)
	{
		return (int)(Math.ceil((Math.log(n) / Math.log(2))))
			== (int)(Math.floor(((Math.log(n) / Math.log(2)))));
	}

	
	public static void main(String[] args)
	{
		int N;
		if (checkNumber(6))
			System.out.println("Yes");
		else
			System.out.println("No");

		if (checkNumber(8))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}



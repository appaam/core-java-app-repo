package com.sapient.aem.ui;

public class SumOfSquares {
	
	public static int calculateDifference(int n){

	    int l, k, sum;
		
		l = (n * (n + 1) * (2 * n + 1)) / 6;
		
	
		k = (n * (n + 1)) / 2;

		k = k * k;
		
		
		sum = Math.abs(l - k);
		
		return sum;

	}

	
	public static void main(String s[])
	{
		int n = 10;
		System.out.println(calculateDifference(n));	
		
	}
	}

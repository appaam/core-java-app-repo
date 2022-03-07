package com.sapient.aem.ui;

public class SumOfNumberDivisble {
 static int CalculateSum(int n)
 {
	int sum1,sum2,sum3,sum;
	sum1=((n/3))*(2*3+(n/3-1)*3)/2;
	sum2=((n/5))*(2*5+(n/5-1)*5)/2;
	sum3=((n/15))*(2*15+(n/15-1)*15)/2;
	sum=sum1+sum2-sum3;
	return sum;
 }
 public static void main(String[] args) {
	 int N=20;
	 System.out.println(CalculateSum(15));
 }
}

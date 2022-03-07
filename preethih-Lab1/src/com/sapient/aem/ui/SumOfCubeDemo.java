package com.sapient.aem.ui;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.sapient.aem.service.SumOfCube;
public class SumOfCubeDemo {
	
	   // Function to read n and display the sum
	  public static void main(String[] args) {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      int n;
	      System.out.println("Enter the value of n");
	      try{
	          n = Integer.parseInt(br.readLine());
	      }catch (Exception e){
	          System.out.println("An error occurred");
	          return;
	      }
	      if(n<0){
	          System.out.println("n cannot take negative values");
	          return;
	      }
	      double sum = Math.pow(n*(n+1)/2,2);
	      System.out.println("The sum of first " + n + " cube numbers is " + sum);
	  }
	}


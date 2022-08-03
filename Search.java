package com.array.demo;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		double nums[] = new double[3];
		System.out.println(" Enter the "  + nums.length  +  " double value " );
		for(int n=0; n<nums.length; n++) {
	    	nums[n] = scanner.nextDouble();
		}
		  double x;
		  
		  System.out.println(" Enter the elements to find : ");
		  x = scanner.nextDouble();
		  
		  boolean isFound = false;
		  
		  for(int n=0; n<nums.length; n++) {
				if(nums[n] == x) {
					System.out.println(" Element is found at the location " + (n+1));
					isFound = true;
					break;
				}
		  }
				if(!isFound == true) 
					System.out.println(" Element is not found. ");
		
		scanner.close();
	}
		  
	}

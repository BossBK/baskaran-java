package com.array.demo;

import java.util.Scanner;

public class Employees {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int nums[] = new int[5];
		
		System.out.println(" Enter "  +  nums.length  +  " Salary ");
		for(int i=0; i<nums.length; i++) {
			nums[i] = scanner.nextInt();
		}
		
		System.out.println(" Employees Salary is: ");
		 for(int i=0; i<nums.length; i++) {
			 System.out.println(nums[i]);
		 }
		 
		   int sum = 0;
		   for(int i=0; i<nums.length; i++) {
			   sum = sum + nums[i];
		   }
		 
		   System.out.println(" sum = " + sum);
		 double avg = (double) sum / nums.length;
		 System.out.println("  double avg: " +avg );
		
		scanner.close();
		
	}

}

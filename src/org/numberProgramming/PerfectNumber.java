package org.numberProgramming;

public class PerfectNumber {
	public static void main(String [] args) {
		
		for(int i = 2; i <= 10000; i++) {
			int sum = 1;
			for(int j = 2; j<i; j++) {
				if (i%j==0) {
					sum = sum+j;
				}
			}
			if (sum == i) {
			System.out.println(i);
			}
		}
			
	}
}

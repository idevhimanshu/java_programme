package org.numberProgramming;

public class FibonacciExample {
	public static void main(String [] args) {  
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 2; i <= 15; i++) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
	}
}

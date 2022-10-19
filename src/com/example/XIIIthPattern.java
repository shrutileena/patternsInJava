package com.example;

public class XIIIthPattern {

	static void printThirteenthPattern(int n) {
		
		int k = 0; 
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {		
				k = k + 1;
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printThirteenthPattern(5);
	}

}

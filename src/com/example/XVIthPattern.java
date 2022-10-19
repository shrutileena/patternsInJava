package com.example;

public class XVIthPattern {

	static void printSixteenthPattern(int n) {
		
		char c = 'A';
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<=i; j++) {
				System.out.print(c);
			}
			System.out.println();
			++c;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSixteenthPattern(5);
	}

}

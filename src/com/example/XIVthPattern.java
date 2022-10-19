package com.example;

public class XIVthPattern {

	static void printFourteenthPattern(int n) {
		
		for(int i=0; i<n; i++) {
			char c = 'A';
			
			for(int j=0; j<=i; j++) {
				System.out.print(c);
				++c;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFourteenthPattern(5);
	}

}

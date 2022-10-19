package com.example;

public class XVthPattern {

	static void printFifteenthPattern(int n) {
		
		for(int i=n; i>0; i--) {
			char c = 'A';
			
			for(int j=1; j<=i; j++) {
				System.out.print(c);
				++c;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFifteenthPattern(5);
	}

}

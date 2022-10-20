package com.example;

public class XVIIIthPattern {

	static void printEighteenthPattern(int n) {
		
		for(int i=1; i<=n; i++) {
			int c = 69;
			
			for(int j=1; j<=i; j++) {
				System.out.print((char)(c-(i-1))+" ");
				++c;
			}
			System.out.println();
		}
		

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printEighteenthPattern(5);
	}
}

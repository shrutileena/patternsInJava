package com.example;

public class XthPattern {

	static void printTenthPattern(int n) {
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n; i>1; i--) {
			for(int j=1; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTenthPattern(5);	
	}

}

package com.example;

public class XIXthPattern {

	static void printNineteenthPattern(int n) {
		int k=0;
		for(int i=n; i>=1; i--) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=0; j<k; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			k=k+2;
		}
		k=k-2;
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=0; j<k; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			k=k-2;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNineteenthPattern(5);
	}

}

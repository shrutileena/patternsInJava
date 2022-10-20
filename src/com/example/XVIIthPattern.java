package com.example;

public class XVIIthPattern {

	static void printSeventeenthPattern(int n) {
		for(int i=0; i<n; i++) {
			for(int j=n-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print((char)(65+j));
			}
			for(int j=0; j<i; j++) {
				System.out.print((char)((65-j)+(i-1)));
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSeventeenthPattern(4);
	}

}

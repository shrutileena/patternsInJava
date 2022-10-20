package com.example;

public class XXthPattern {

	static void printTwentiethPattern(int n) {
		int k=n-1;
		int mid = n/2;
		for(int i=1; i<=mid+1; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=0; j<k; j++) {
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
			k=k-2;
		}
		k=2;
		for(int i=mid; i>=1; i--) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=0; j<k; j++) {
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
			k=k+2;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTwentiethPattern(9);
	}

}

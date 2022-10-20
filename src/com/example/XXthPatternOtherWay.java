package com.example;

public class XXthPatternOtherWay {

	static void printTwentiethPattern(int n) {
		int k=n+(n-2);
		for(int i=1; i<=n; i++) {
			
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
		for(int i=n-1; i>=1; i--) {
			
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
		printTwentiethPattern(5);
	}

}

package com.example;

public class XIIthPattern {
	
	static void printTwelthPattern(int n) {
		int k=n+(n-1);
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			for(int j=0; j<k-i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println();
			--k;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTwelthPattern(4);
	}

}

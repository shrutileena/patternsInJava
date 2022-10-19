package com.example;

public class IXthPatternPart3 {

	static void printNinthPattern(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=n; i>0; i--) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=i; k>=1; k--) {
				System.out.print("* ");
			}
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNinthPattern(5);
	}

}

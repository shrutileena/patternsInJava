package com.example;

public class XVIIIthPatternOtherWay {
	
	static void printEighteenthPattern(int n) {
		for(int i=n; i>=1; i--) {
			
			for(int j=n; j>=i; j--) {
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printEighteenthPattern(5);
	}

}

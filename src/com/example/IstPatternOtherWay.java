package com.example;

public class IstPatternOtherWay {

	static void printFirstPattern(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFirstPattern(5);
	}

}

package com.tyss.onlyalphabets;

public class I_Pattern {
	public static void main(String[] args) {
		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i == 1 || j == (num + 1)/2 || i == num)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
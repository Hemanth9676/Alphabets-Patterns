package com.tyss.onlyalphabets;

public class W_Pattern {
	public static void main(String[] args) {
		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (j == 1 || i + j == num + 1 && i >= (num + 1) / 2 || i == j && i >= (num + 1) / 2 || j == num)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}

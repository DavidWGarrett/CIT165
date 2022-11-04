package chapter5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < i; j++)
			System.out.println(i * j);

	}
	
	static void nPrint(String message, int n) {
		while (n > 0) {
		System.out.print(message);
		n--;
		}
		}

}

package lab3;

import java.util.Scanner;

public class decisions {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter a number: ");

		int num = scnr.nextInt();

		if (num % 2 == 0 && num >= 2 && num <= 25) {
			System.out.println("Even and less than 25");
		} else if (num % 2 == 0 && num >= 26 && num <= 60) {
			System.out.println("Even");
		} else if (num % 2 == 0 && num > 60) {
			System.out.println(num + " : even ");
		} else if (num % 2 != 0 && num > 60) {
			System.out.println("Odd" + " and over 60");
		} else if (num % 2 != 0) {
			System.out.println(num + " : odd ");
		}
	}
}

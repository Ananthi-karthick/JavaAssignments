package day2;

import java.util.Scanner;

public class UtopianTree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter cycles:");
		int n = scanner.nextInt();
		while (n > 0) {
			System.out.println("enter period:");
			int period = scanner.nextInt();
			int height = 1;
			for (int i = 1; i <= period; i++) {
				if (i % 2 == 0)
					height += 1;

				else
					height *= 2;

			}
			System.out.println(height);
			n--;
		}

	}
}

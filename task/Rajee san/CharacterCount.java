package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = s.next();
		StringBuilder sb1 = new StringBuilder();
		List l = new ArrayList();
		StringBuilder sb = new StringBuilder(str);
		int count;
		for (int i = 0; i < sb.length() - 1; i++) {
			count = 1;
			for (int j = i + 1; j < sb.length(); j++) {
				if (sb.charAt(i) == sb.charAt(j) && sb.charAt(i) != ' ') {
					count++;
					sb.setCharAt(j, ' ');

				}

			}

			if (count == 1 && sb.charAt(i) != ' ')

				l.add(sb.charAt(i));

			else if (sb.charAt(i) != ' ') {
				l.add(sb.charAt(i));
				l.add(count);
			}

		}

		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i));
		}
	}
}
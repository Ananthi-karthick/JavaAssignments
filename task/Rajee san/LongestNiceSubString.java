package day4;//bubble sort

import java.util.HashSet;

import java.util.Scanner;
import java.util.Set;

class SubString {
	public String longestNiceSubstring(String s) {
		if (s.length() < 2)
			return " ";
		Set<Character> set = new HashSet<>();
		for (char c : s.toCharArray())
			set.add(c);
		for (int i = 0; i <= s.length() - 1; i++) {
			if (set.contains(Character.toUpperCase(s.charAt(i))) && set.contains(Character.toLowerCase(s.charAt(i))))
				continue;
			String subs1 = longestNiceSubstring(s.substring(0, i));
			String subs2 = longestNiceSubstring(s.substring(i + 1));
			return subs1.length() >= subs2.length() ? subs1 : subs2;
		}
		return s;
	}
}

public class LongestNiceSubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.next();
		SubString c = new SubString();

		System.out.println(c.longestNiceSubstring(s));
	}
}

package day2;

import java.util.ArrayList;
import java.util.List;

public class SequenceOfString {

	public static void sequenceOfString() {
		int start = 0, pos = 0, i = 0;
		List<Integer> al = new ArrayList<>();
		String s = "IIDDIDID";
		if (s.charAt(0) == 'I') {
			al.add(1);
			al.add(2);
			start = 3;
			pos = 1;
		} else {
			al.add(2);
			al.add(1);
			start = 3;
			pos = 0;
		}
		System.out.println(al);
		for (i = 1; i < s.length(); i++) {
			if (s.charAt(i) == 'I') {
				al.add(start);
				start++;
				pos = i + 1;

			} else {
				al.add(al.get(i));
				for (int j = pos; j <= i; j++)
					al.set(j, al.get(j) + 1);
				start++;// 4
			}
			System.out.println(al);
		}
		for (i = 0; i < al.size(); i++)
			System.out.print(al.get(i));
		System.out.println();
	}

	public static void main(String[] args) {
		SequenceOfString.sequenceOfString();

	}

}

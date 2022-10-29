package day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class WeightedUniformStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuffer sb = new StringBuffer(s);
		int count = 1;
		int j = 1;
		List<String> output = new ArrayList<>();
		List<Integer> ans = new ArrayList<>();
		List<Integer> queries = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			queries.add(sc.nextInt());
		}

		Map<Character, Integer> m1 = new HashMap<>();
		for (char i = 'a'; i <= 'z'; i++) {
			m1.put(i, j);
			j++;
		}
		Map<Character, Integer> m2 = new HashMap<>();// abcddde
		for (int i = 0; i < s.length(); i++) {
			count = 1;
			for (int k = i + 1; k < s.length(); k++) {
				if ((sb.charAt(i) == sb.charAt(k)) && sb.charAt(i) != ' ') {
					count++;
				}
			}
			m2.put(s.charAt(i), count);
			s = s.replace(sb.charAt(i), ' ');
		}
System.out.println(m2);
		for (Entry<Character, Integer> entry : m1.entrySet()) {
			for (Entry<Character, Integer> entry1 : m2.entrySet()) {
				if (entry.getKey() == (entry1.getKey())) {
					int n3=entry1.getValue();
					
					while(n3>0) {
						ans.add(entry.getValue()*n3);
						n3--;
					}
				}
			}
			
		}
		

		for (Integer tempList : queries)
			output.add(ans.contains(tempList) ? "Yes" : "No");
		System.out.println(output);

	}
}

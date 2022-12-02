package date28;

import java.util.Scanner;

//Input : House No : 123@ CBE 
//Output : EBC32 1o : Nes@ uoH 

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		String s1 = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			if (string.charAt(i) != '@' && string.charAt(i) != ':' && string.charAt(i) != ' ') {
				s1 += string.charAt(i);

			}

		}
		System.out.println(s1);
		for (int i = 0, j = 0; i < string.length(); i++) {
			if (string.charAt(i) != '@' && string.charAt(i) != ':' && string.charAt(i) != ' ') {
				System.out.print(s1.charAt(j));
				j++;
			} else
				System.out.print(string.charAt(i));
		}

	}

}

package date28;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OddCharactersInString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String mainString = input.next();
		String subString = input.next();
		int count = 0, count1 = 0;

		for (char character : mainString.toCharArray()) {
			count++;

		}
		for (char character : subString.toCharArray()) {
			count1++;

		}int i=0,j=0;
		String result="";
		while(i<count && j<count1) {
				if(mainString.charAt(i)!=subString.charAt(j))
				{
					result+=mainString.charAt(i);
					result+=subString.charAt(j);
				}
		i++;
		j++;
					
			}
		System.out.println(result);
}

	}



package day1;

import java.util.Scanner;

public class NumbersToWords {

	public static void main(String[] args) {
		String[] one_digit = { " ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] two_digit = { " ", "eleven", "tewlve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen" };
		String[] round_digit = { " ", "Ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };
		String[] three_digit = { " ", "onehundred", "twohundred", "threehundred", "fourhundred", "fivehundred",
				"sixhundred", "sevenhundred", "eighthundred", "ninehundred" };
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int count = 0, n = 0, m = 0;
		int temp = number;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		if (count == 1) {
			System.out.println(one_digit[temp]);//20
		} else if (count == 2) {
			if (temp > 20 && temp%10!=0)
				System.out.println(round_digit[temp / 10] + one_digit[temp % 10]);
			else if(temp%10==0)
			{
				System.out.println(round_digit[temp / 10]);
			}
			else
				System.out.println(two_digit[temp - 10]);
		} else if (count == 3)
		{
			  n = temp / 100;
              m = (temp% 100)/10;
              int l = (temp % 100)%10;

               System.out.print( three_digit[n] + " " + round_digit[m] + " " + one_digit[l]);

			
		}

	}

}

package date28;

import java.util.Arrays;
import java.util.Scanner;

public class NearestNumberOfArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int size = input.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = input.nextInt();
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));

		int average = sum / size;
		int min_diff = Integer.MAX_VALUE;
		int result = -1;

		for (int i = 0; i < size; i++) {
			int diff = arr[i] - average;
			if (diff < 0) {
				diff *= -1;
			}

			if (diff < min_diff) {
				min_diff = diff;
				result = i;
			}
		}

		System.out.println("The element is: " + arr[result]);
	}
}
package day3test1;

public class LinkedList {

	public static void main(String[] args) {
		int[] a = { 2, 7, 4, 3, 5 };
		int n = a.length;
		int max = 0;
		int[] a1 = new int[n];
		for (int i = 0; i < n - 1; i++) {
			max = a[i];
			for (int j = i + 1; j < n; j++) {
				if (max < a[j]) {
					max = a[j];
				}

			}
			if (max != a[i])
				a1[i] = max;
			else
				a1[i] = 0;
		}
		a1[n - 1] = 0;
		for (int x : a1) {
			System.out.print(x + ",");
		}
	}

}

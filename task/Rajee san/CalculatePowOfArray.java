package date28;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatePowOfArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
		}

		int pow = input.nextInt();
		for (int i = 0; i < size; i++) {
			int value = 1;
			int temp = pow;

			while (temp != 0) {
				value *= array[i];
				temp--;
			}
			array[i] = value;
		}
		
		for(int i=0;i<size-1 ;i++)
		{
			for(int j=i+1;j<size ;j++)
			{
				if(array[i]>array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

}

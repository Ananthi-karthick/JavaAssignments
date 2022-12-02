package date28;

import java.util.Arrays;
import java.util.Scanner;
public class ReverseSubArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=input.nextInt();
		}
		int k=input.nextInt();
		for(int i=0;i<n;i+=k)
		{
			int left_index=i;
			
			int right=i + k - 1;
			int rigth_index=(right<n-1)?right:n-1;
		    
					

			while (left_index < rigth_index) { 
				int temp = array[left_index]; 
				array[left_index] = array[rigth_index]; 
				array[rigth_index] = temp; 
				left_index++; 
				rigth_index--; 
			} 
		}System.out.println(Arrays.toString(array));
		}

	}
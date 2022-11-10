package day5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfElementsAscending {// 3 3 7 7 3     7 7 3 3 3 

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=input.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the elements:");
		for(int x=0;x<size;x++)
		{
			array[x]=input.nextInt();
		}
		Map<Integer,Integer> elementFrequency=new LinkedHashMap<>();
		for(int i=0;i<array.length;i++) {
			elementFrequency.put(array[i], elementFrequency.getOrDefault(array[i],0)+1);
		}
		List sortedArray=new ArrayList();
		elementFrequency.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue()).
		forEach(frequencyRecord->{
			int element=frequencyRecord.getKey();
			int frequency=frequencyRecord.getValue();
			for(int i=1;i<=frequency;i++)
			{
				sortedArray.add(element);
			}
		});
		System.out.println(sortedArray);
	}

}

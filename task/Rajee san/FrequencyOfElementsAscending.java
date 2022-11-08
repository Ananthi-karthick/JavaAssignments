package day5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfElementsAscending {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements:");
		for(int x=0;x<n;x++)
		{
			a[x]=sc.nextInt();
		}
		Map<Integer,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<a.length;i++) {
		 map.put(a[i], map.getOrDefault(a[i],0)+1);
		}
		List l=new ArrayList();
		map.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue()).
		forEach(record->{
			int k=record.getKey();
			int value=record.getValue();
			for(int i=1;i<=value;i++)
			{
				l.add(k);
			}
		});
		System.out.println(l);
	}

}

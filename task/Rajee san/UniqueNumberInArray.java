package day4;
import java.util.*;
public class UniqueNumberInArray {//11

	public static void main(String[] args) {//{1 1 2 2 3 3 4 50 50 65 65}
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ans=0,xor=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			xor=xor^a[i];//0^1=1 
		}
		System.out.println(xor);
	}
}



package day3test1;
import java.util.Scanner;
public class ProductOfArray {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int product=1;
		int n=s.nextInt();
		int[] a=new int[n];
		int[] a1=new int[n];
		for(int x=0;x<n;x++)
			{
			a[x]=s.nextInt();
		}
		for(int i=0;i<n;i++)//1 2 3 4
		{ 
			product =1;
			for(int j=0;j<n;j++)
			{
				product*=a[j];
			}
			a1[i]=product/a[i];
		}
		for(int x:a1)
		System.out.println(x);
	}

}

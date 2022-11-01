package day3test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Triplets {

	public static void main(String[] args) {
		int[] a= {-1,0,1,2,-1,-4};
		int[] a1=new int[3];
		int sum=0;
int n=a.length;

for(int i=0;i<n-2;i++)
{    sum=0;
	for(int j=i+1;j<n-1;j++)
	{
		for(int k=i+2;k<n;k++)
		{
			if(a[i]+a[j]+a[k]==0 && i!=j &&i!=k && j!=k) {
				System.out.println(a[i]+" "+a[j]+" "+a[k]);
			}
		}
		
		
	}
	
	
}


	}
	}
	



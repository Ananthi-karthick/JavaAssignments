package day8;
//Input. :  4
//Output :
//                    1    2   3   4
//              8    7    6   5
//        9  10  11  12
//16  15  14  13

import java.util.Scanner;
public class SnakePattern {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=1,l=n*2;
		for(int i=1;i<=n;i++)
		{
			
			for(int k=1;k<n+1-i;k++)
			{
				System.out.print("-"+"   ");
			}
			if(i%2!=0) {
			for(int j=n;j<=(n*2)-1;j++)
			{
				System.out.print(m++ +"    ");
			}
			m=l+1;
			}
			else {
				for(int j=n;j<=(n*2)-1;j++)
				{
					System.out.print(l-- +"    ");
				}	
			l=n*4;
		}
			System.out.println();

		}

	}

}

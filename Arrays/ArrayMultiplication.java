import java.util.Scanner;
public class ArrayMultiplication 
{
public static void main(String[] args)
	{
		        Scanner in=new Scanner(System.in);
		        System.out.println("enter the no of rows and columns of first array:");
		        int n=in.nextInt();
		        int m=in.nextInt();
		       int arr1[][]=new int [n][m];
		       System.out.println("enter the no of rows  and columns of second array:");
		        int k=in.nextInt();
		        int l=in.nextInt();
		        int arr2[][]=new int [k][l];
		         System.out.println("enter the elements of first array:");
		         for(int i=0;i<n;i++)
		         {
		             for(int j=0;j<m;j++)
		             {
		                 arr1[i][j]=in.nextInt();
		             }
		         }
		         System.out.println("enter the elements of second array:");
		         for(int i=0;i<k;i++)
		         {
		             for(int j=0;j<l;j++)
		             {
		                 arr2[i][j]=in.nextInt();
		             }
		             int ans[][]=new int [n][l];
		             System.out.println("multiplication of two arrays:");
		             for(i=0;i<n;i++)
		             {
		                 for(int j=0;j<l;j++)
		                 {
		                     for(int p=0;p<m;p++)
		                     {
		                         ans[i][j]+=arr1[i][p]*arr2[p][i];
		                     }
		                     System.out.print(ans[i][j]+" ");
		                 }
		             }
	}
}
		}
	

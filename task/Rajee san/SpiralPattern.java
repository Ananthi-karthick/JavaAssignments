package day6;
import java.util.Scanner;
public class SpiralPattern {
/*  1  2  3  4 5
 * 16 17 18 19 6
 * 15 24 25 20 7
 * 14 23 22 21 8
 * 13 12 11 10 9
 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int dimension=input.nextInt();
		
		int[][] output=new int[dimension][dimension];
		int i=1,minCol=0,maxCol=dimension-1,minRow=0,maxRow=dimension-1;
		while(i<=dimension*dimension)
		{
			for(int j=minCol;j<=maxCol;j++)
			{
				output[minRow][j]=i++;
			}
			for(int  j=minRow+1;j<=maxRow;j++)
			{
				output[j][maxCol]=i++;
			}
			for(int j=maxCol-1;j>=minCol;j--)
			{
				output[maxRow][j]=i++;
			}
			for(int j=maxRow-1;j>=minRow+1;j--)
			{
				output[j][minCol]=i++;
			}
			minCol++;maxCol--;minRow++;maxRow--;
		}
		for(int l=0;l<dimension;l++)
		{
			for(int m=0;m<dimension;m++)
			{
				System.out.print(output[l][m]+"  ");
			}
			System.out.println();
		}

	}

}

import java.util.Scanner;
import java.util.Arrays;

public class arrayRotation {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
        System.out.print("enter the range");
        int n = in.nextInt();
        int[] inputArray = new int[n];
        System.out.println("elements of array:");
        for(int j=0 ;j<n;j++)
            inputArray[j] = in.nextInt();
        Arrays.sort(inputArray);
        int temp[]=new int[n];
        int j=n/2;
        if(n%2==0)
        {
        	j=n/2-1;
        }
        boolean x=true;
        int m=1,p=1;
        temp[0]=inputArray[j];   
           for(int i=1;i<n;i++)
           {
        	   if(x)
        	   {
                 temp[i]=inputArray[j+m];
                 m++;
        	   }
        	 else
        	   {
        		   temp[i]=inputArray[j-p];
        		   p++;
        	   }
           x=!x;
           
	}
	for(int i = 0;i<n;i++)
{
	System.out.print(temp[i]+" ");
}
}
}

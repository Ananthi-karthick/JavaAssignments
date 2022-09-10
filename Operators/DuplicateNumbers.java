import java.util.*;
public class DuplicateNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int n,val=0,i;
	    System.out.print("Enter no.of elements of an array: ");  
		n = s.nextInt();  
	    int[] a = new int[n];
	     System.out.println("Enter array elements:");
	     for (i=0; i<n;i++)
	     {
	    	 a[i]=s.nextInt();
	     }
	     s.close(); 
	     System.out.println("duplicate elements of array:");
	     for (i=0;i<n;i++)  
	     {  
	         for (int j=i+1;j<n;j++)  
	         {  
	               val=a[i]^a[j];  

	              if (val==0)  
	              { 
	            	  System.out.println(a[i]);
	              }
	  }	
}
	}
}
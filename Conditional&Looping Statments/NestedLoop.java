
public class NestedLoop {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5},b= {5,6,7,8,9};
		int n=5;
   int result=0;
   System.out.print("Addition of two arrays:");  
   for(int i=0;i<n;i++)
   {
	   for(int j=0;j<n;j++)
	   {
		   result=a[i++]+b[j];
		   System.out.print(result+" ");  
	   }
	   System.out.println(); 
   }
   
	}

}

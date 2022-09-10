import java.util.*;
public class OddOrEven 
{
public static void main(String[] args)
{
		 int n;
		 Scanner s = new Scanner(System.in);  
			System.out.print("Enter the number: ");  
			n = s.nextInt();  
			s.close();
		 if ((n | 1) > n)
		 {
			 
			 System.out.println(n+" is an Even Number");
		 }
		 
	        else
	        {    
	 System.out.println(n+"is a Odd Number");
	}
		 }
}
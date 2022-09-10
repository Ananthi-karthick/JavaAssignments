
import java.util.Scanner;

public class NestedConditional 
{
	
	public static void main(String[] args) {
		double weight=0,height=0;
		Scanner in = new Scanner(System.in);		
		System.out.println(" Please Enter you height: ");
		height = in.nextDouble();
		System.out.println(" Please Enter you Weight: ");
		weight = in.nextDouble();
		if(height>=1.5 && height<=1.6) 
		{
		if (weight<40.0) {
			System.out.println(" UnderWeight.."); 
		}
		else  {
			if (weight>=40.0 && weight <= 60.0 )  {
				System.out.println("Normal Weight... ");
				
			}
			else  {
				System.out.println("OverWeight...");
				
			}
		}
		}
			
	}
	
}

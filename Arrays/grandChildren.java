

import java.util.*;

public class grandChildren {

	public static void main(String[] args) {
		
		
		String family[][] = {{"luke","wayne"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
	    String child = "";
	    int count = 0;
	    

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Name of person:");
		String str = in.nextLine();
	    
		
		 for (int i=0;i<family.length;i++)
		 {
			
				 if (family[i][1].equals(str))
					 {
					
							 child = family[i][0];
							 
					 }
			
		 }
		 for (int k=0;k<family.length;k++)
			 {
				 
				 if (family[k][1]== child)
				 {
					 count++;
					 
					 
				 }
				 
			 }
		 System.out.println("No.of Grand children " + str + " : " + count);
  }
}
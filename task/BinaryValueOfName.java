package work;
import java.util.Scanner;
public class BinaryValueOfName {

	public static void main(String[] args) {
		Scanner userName=new Scanner(System.in);
		String name;
		System.out.println("Enter name:");
		name=userName.next();
		int nameLength=name.length();
		int i=0;
		userName.close();
		for(i=0;i<nameLength;i++)
		{
		char individualChar=name.charAt(i);
		int asciiValueOfChar=individualChar;
		int binaryValue=0;
		if(asciiValueOfChar > 0) {
	             binaryValue = asciiValueOfChar % 2;
	             asciiValueOfChar = asciiValueOfChar / 2;
		
	       		System.out.println(individualChar+"-"+binaryValue);
		}
		
	}

}
	
}
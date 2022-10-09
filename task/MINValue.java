package work;

public class MINValue {
	public static void main(String[] args) {

		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
	}
	/*
	 * unlike the Integer class,where the MIN VALUE is negative, the Double class’s
	 * MAX VALUE and MIN VALUE are both positive integers. Double.MIN VALUE is
	 * 2^(-1074), a double constant with the least magnitude of all double values.
	 * 
	 * Because of Double, this program will print 0.0 instead of the obvious answer.
	 * The value of MIN VALUE is greater than zero.
	 */

}
/*
 * question:2 What will happen if you put the return statement or System.exit ()
 * on the ‘try‘ or ‘catch‘ block? Will the ‘finally’ block execute? 
 * ANS:
 * ‘finally’ block will execute successfully, even if you put a return statement
 * in the ‘try’ or ‘catch’ block. However, the ‘finally’ block will fail to
 * execute if you call System.exit() from the ‘try’ or ‘catch’ block.
 */
/*
 * question:3 Can you override a private or static method in Java? 
 * ANS: 
 * You cannot override a static method in Java. If you create an identical method
 * with the same return type and method arguments as the ones in the child
 * class, then it will hide the superclass method. This is also known as method
 * hiding.
 * 
 * Likewise, overriding a private method in the subclass is impossible as it is
 * not accessible there. You can create a new private method with the same name
 * in the child class as a workaround.
 */

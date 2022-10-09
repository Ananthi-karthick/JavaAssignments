package work;

public class Expression1 {

	public static void main(String[] args) {
		System.out.println(1 / 0);// throw ArithmeticException
		System.out.println(1.0 / 0.0);

	}
	/*
	 * It will compile successfully and not throw ArithmeticException. It will
	 * instead return Double.Infinity.
	 * 
	 * 
	 **/

	/*
	 * Question 5: Does Java support multiple inheritances? ANS: Java supports
	 * multiple inheritances of Type by enabling one interface to extend other
	 * interfaces, the answer is considerably more complicated than it appears. Java
	 * does not allow multiple inheritances of implementation.
	 * 
	 */
	/*
	 * Question 6:What will happen if we put a key object in a HashMap already
	 * there?
	 *  ANS: HashMap does not allow duplicate keys, so putting the same key
	 * again will overwrite the original mapping. The same key will generate the
	 * same hashcode and will end up at the same bucket position. Each bucket
	 * contains a linked list of maps.
	 * 
	 * This is an entry object that has both a Key and a Value. Now Java will
	 * compare each entry’s Key object to this new key using the equals() method,
	 * and if the comparison returns true, the value object in that entry will be
	 * replaced by the new value.
	 */

}

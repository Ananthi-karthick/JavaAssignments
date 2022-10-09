package work;

import java.util.Arrays;

public class CharStringByte {

	public static void main(String[] args) throws Exception {
		char[] chars = new char[] { '\u0097' };
		System.out.println("1" + chars); // 1[C@515f550a
		System.out.println("2" + Arrays.toString(chars)); // 2[]
		String str = new String(chars);
		System.out.println("3" + str);
		byte[] bytes = str.getBytes();
		System.out.println("4" + bytes);// 4[B@cac736f
		System.out.println("5" + Arrays.toString(bytes)); // 5[-62, -105]
	}
	/*
	 * This question is particularly tricky because the output of this program is
	 * dependent on the operating system and locale. On a Windows XP with the US
	 * locale, the above program prints 63, but if you run this program on Linux or
	 * SOlaris, you will get different values.
	 */
}/*
	 * 
	 * Question 8:If a method throws NullPointerException in the superclass, can we override it
	 * with a method that throws RuntimeException? 
	 * Answer: Yes, you can throw a
	 * superclass of RuntimeException in overridden method, but you can not do that
	 * if it’s a checked Exception.
	 * 
	 * 
	 */

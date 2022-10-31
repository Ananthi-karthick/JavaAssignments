package day2;


public class StringIsImmutable {

	private static void stringsAreImmutable() {
		String s1 = "String is immutable....";
		s1.concat("it's a true statement");
		System.out.println(s1);
		s1.split(s1, 5);
		System.out.println(s1);
	}

	public static void main(String[] args) {

		StringIsImmutable.stringsAreImmutable();

	}

}

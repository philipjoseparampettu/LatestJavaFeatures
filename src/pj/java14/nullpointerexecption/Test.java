package pj.java14.nullpointerexecption;

import java.util.Locale;

public class Test {

	public static void main(String[] args) {

		String message = """

				Need to set -XX:+ShowCodeDetailsInExceptionMessages for VM arguments
				1. Output without Java 14 is Exception in thread "main" java.lang.NullPointerException
				at Test.showUpperCase(Test.java:15)
				at Test.main(Test.java:9)

				2. Post Java 14 :
					Exception in thread "main" java.lang.NullPointerException:
					  Cannot invoke "String.toUpperCase(java.util.Locale)" because "<parameter1>" is null
						at Test.showUpperCase(Test.java:15)
						at Test.main(Test.java:9)

				3. Pre Java 14
				Exception in thread "main" java.lang.NullPointerException
					at Test.showUpperCase(Test.java:15)
					at Test.main(Test.java:9)

					4. Note that in Post Java 14 variable name is available in exception trace
				""";
		System.out.println(message);
		String input = null;
		String result = showUpperCase(input); // NullPointerException
		System.out.println(result);

	}

	public static String showUpperCase(String str) {
		return str.toUpperCase(Locale.US);
	}

}

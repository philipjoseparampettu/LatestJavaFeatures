package pj.java8.lamda;

import java.util.Comparator;

public class LamdaApproach {

	public static void main(String... args) {
		Runnable runnable = () -> System.out.println("Howdy, world!");
		runnable.run();

		// multi line example and its also an example of passing parameters
		Comparator<String> c = (String lhs, String rhs) -> {
			System.out.println("I am comparing" + lhs + " to " + rhs);
			return lhs.compareTo(rhs);
		};
		int result = c.compare("Hello", "World");
		System.out.println(result);
	}

}

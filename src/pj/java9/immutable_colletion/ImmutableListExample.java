package pj.java9.immutable_colletion;

import java.util.List;

public class ImmutableListExample {

	public static void main(String[] args) {

		List<String> names = List.of("Lokesh", "Amit", "John");

		// Preserve the elements order
		System.out.println(names);

		// names.add("Brian"); //UnsupportedOperationException occured

		// java.lang.NullPointerException
		// List<String> names2 = List.of("Lokesh", "Amit", "John", null);
	}
}

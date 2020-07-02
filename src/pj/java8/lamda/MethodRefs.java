package pj.java8.lamda;

import java.util.Arrays;

public class MethodRefs {
	public static void main(String... args) {
		Person[] people = { new Person("Jancy", "Philip", 33), new Person("Philip", "Jose", 36) };

		// Sort by first name
		// Better use method references when the logic we need is to be used in multiple
		// places

		// Arrays.sort(people, Person.compareLastName);

		Arrays.sort(people, Person::compareFirstNames);
		for (Person p : people)
			System.out.println(p);

		System.out.println("***********************");
		Arrays.sort(people, Person::compareLastAndAge);
		for (Person p : people)
			System.out.println(p);
	}
}

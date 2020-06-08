package pj.java8.Optionals;

import java.util.Optional;

public class PostJava8NullChecksOptionOne {
	public static void main(String[] args) {
		Optional.of(new Outer()).map(Outer::getNested).map(Nested::getInner).map(Inner::getFoo)
				.ifPresent(System.out::println);
	}
}

package pj.java8.Optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class PostJava8NullChecksOptionTwo {
	public static void main(String[] args) {
		Outer obj = new Outer();
		resolve(() -> obj.getNested().getInner().getFoo()).ifPresent(System.out::println);
	}

	public static <T> Optional<T> resolve(Supplier<T> resolver) {
		try {
			T result = resolver.get();
			return Optional.ofNullable(result);
		} catch (NullPointerException e) {
			return Optional.empty();
		}
	}
}

package pj.java9.private_methods;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * By private method, we can isolate some code from the implementation classes
 * e.g. what add() is doing below.
 * 
 * @author philip
 *
 */
public interface CustomCalculator {
	default int addEvenNumbers(int... nums) {
		return add(n -> n % 2 == 0, nums);
	}

	default int addOddNumbers(int... nums) {
		return add(n -> n % 2 != 0, nums);
	}

	// this would also work with static private method.
	private int add(IntPredicate predicate, int... nums) {
		return IntStream.of(nums).filter(predicate).sum();
	}
}

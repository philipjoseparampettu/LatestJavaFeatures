package pj.java8.Optionals;

public class PreJava8NullChecks {

	public static void main(String[] args) {
		Outer outer = new Outer();
		if (outer != null && outer.nested != null && outer.nested.inner != null) {
			System.out.println(outer.nested.inner.foo);
		}

	}

}

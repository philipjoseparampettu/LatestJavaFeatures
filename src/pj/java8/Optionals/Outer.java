package pj.java8.Optionals;

class Outer {
	Nested nested;

	Nested getNested() {
		return nested;
	}
}

class Nested {
	Inner inner;

	Inner getInner() {
		return inner;
	}
}

class Inner {
	String foo;

	String getFoo() {
		return foo;
	}
}

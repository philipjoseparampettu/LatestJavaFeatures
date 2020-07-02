package pj.java8.lamda;

class Person {
	public String firstName;
	public String lastName;
	public int age;

	// Below approach of saving the instance of comparator is fine but not clear in
	// java terms hence instead used two methods which can handled using method
	// references
	// public final static Comparator<Person> compareLastName = (lhs, rhs) ->
	// lhs.lastName.compareTo(rhs.lastName);
	// public final static Comparator<Person> compareFirstName = (lhs, rhs) ->
	// lhs.firstName.compareTo(rhs.firstName);

	public static int compareFirstNames(Person lhs, Person rhs) {
		return lhs.firstName.compareTo(rhs.firstName);
	}

	public static int compareLastAndAge(Person lhs, Person rhs) {
		if (lhs.lastName.equals(rhs.lastName))
			return lhs.age - rhs.age;
		else
			return lhs.lastName.compareTo(rhs.lastName);
	}

	public Person(String f, String l, int a) {
		firstName = f;
		lastName = l;
		age = a;
	}

	@Override
	public String toString() {
		return "[Person: firstName:" + firstName + " " + "lastName:" + lastName + " " + "age:" + age + "]";
	}
}

package pj.java8.lamda.collections;

import java.util.Comparator;

class Person {
	public String firstName;
	public String lastName;
	public int age;

	public Person(String f, String l, int a) {
		firstName = f;
		lastName = l;
		age = a;
	}

	@Override
	public String toString() {
		return "[Person: firstName:" + firstName + " " + "lastName:" + lastName + " " + "age:" + age + "]";
	}

	// old approach1
//	public static final Comparator<Person> BY_LAST_AND_AGE = (lhs, rhs) -> {
//		if (lhs.lastName.equals(rhs.lastName))
//			return lhs.age - rhs.age;
//		else
//			return lhs.lastName.compareTo(rhs.lastName);
//	};

	// old approach2
	// drawback of approach 1 and approach 2 is comparator is tied to age and name
//	public static int compareLastAndAge(Person lhs, Person rhs) {
//		if (lhs.lastName.equals(rhs.lastName))
//			return lhs.age - rhs.age;
//		else
//			return lhs.lastName.compareTo(rhs.lastName);
//	}

	// better approach1
//	public static final Comparator<Person> BY_FIRST = (lhs, rhs) -> lhs.firstName.compareTo(rhs.firstName);
//	public static final Comparator<Person> BY_LAST = (lhs, rhs) -> lhs.lastName.compareTo(rhs.lastName);
//	public static final Comparator<Person> BY_AGE = (lhs, rhs) -> (lhs.age - rhs.age);

	// better approach2 - * new in comparator method
	public static final Comparator<Person> BY_FIRST = Comparator.comparing(Person::getFirstName);
	public static final Comparator<Person> BY_LAST = Comparator.comparing(Person::getLastName);
	public static final Comparator<Person> BY_AGE = Comparator.comparing(Person::getAge);

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

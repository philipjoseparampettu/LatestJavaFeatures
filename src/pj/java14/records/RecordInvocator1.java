package pj.java14.records;

public class RecordInvocator1 {
	public static void main(String[] args) {
		Employee employeeRecord = new Employee(35, "Philip");
		System.out.println(employeeRecord.age());
		System.out.println(employeeRecord.name());
		System.out.println(employeeRecord);
		@SuppressWarnings("preview")
		String whatsNew = """

				NB  * Records are for final DTO classes *
				1. Don't have setters hence can't modify the value once objects are created
				2. toString, hashCode etc are created automatically.
				3. If I modify a method or create a method, that wont
				   be taken into account in the toString and hashCode()
				   Its generally discouraged.
				""";

		System.out.println(whatsNew);
	}
}

package pj.java14.Instanceof;

@SuppressWarnings("preview")
public class InstanceOfCase {
	public boolean isBlank(Object o) {
		return (o instanceof String s) && s.isBlank();
	}

	public static void main(String[] args) {
		InstanceOfCase instanceOfCase = new InstanceOfCase();
		System.out.println("instanceOfCase.isBlank(\"\"); " + instanceOfCase.isBlank(""));
		System.out.println("instanceOfCase.isBlank(\"23\"); " + instanceOfCase.isBlank("23"));
		System.out.println("instanceOfCase.isBlank(23); " + instanceOfCase.isBlank(23));

		String whatsNewInTheRelease = """

				*	Please notice that o is type cast to s automatically in java 14.
					Thus saving one line of code  * """;
		System.out.println(whatsNewInTheRelease);
	}

}

package pj.java14.switch_enhancement;

public class MultiSwitchWithArrowCase {
	enum Day {
		MON, TUE, WED, THUR, FRI, SAT, SUN
	};

	public String getDay_1(Day today) {
		String day = switch (today) {
		case MON, TUE, WED, THUR, FRI -> "Weekday";
		case SAT, SUN -> "Weekend";
		};
		return day;
	}

	public static void main(String[] argv) {
		MultiSwitchWithArrowCase arrowCase = new MultiSwitchWithArrowCase();
		System.out.println("Day.FRI : " + arrowCase.getDay_1(Day.FRI));
		System.out.println("Day.SUN : " + arrowCase.getDay_1(Day.SUN));
		System.out.println("NB  * Switch with arrow has break implictly * ");
	}
}

package pj.java14.switch_enhancement;

public class CaseWithArrow {
	public void foo(int i) {
		switch (i) {
		case 2 -> System.out.println("Hello");
		default -> System.out.println("World");
		}
	}

	public static void main(String[] argv) {
		new CaseWithArrow().foo(2);
		System.out.println("NB  * Switch with arrow has break implictly * ");
	}
}

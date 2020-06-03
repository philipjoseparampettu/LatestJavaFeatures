package pj.java14.switch_enhancement;

public class MultipleSwitchCase {
	public void foo(int i) {
		switch (i) {
		case 0, 1, 2:
			System.out.println("Hello");
		default:
			System.out.println("World");
		}
	}

	public static void main(String[] argv) {
		new MultipleSwitchCase().foo(2);
		System.out.println("NB * Multi expects a break, thats why Both Hello andd world got printed * ");
	}
}

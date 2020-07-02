package pj.java8.lamda;

public class OldApproach {

	public static void main(String... args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Howdy, world!");
			}
		};
		r.run();
	}
}

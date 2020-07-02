package pj.java8.lamda;

public class LamdaContextAndVariabes {

	public static void main(String[] args) {

		LamdaContextAndVariabes lcv = new LamdaContextAndVariabes();
		lcv.doSomething();

	}

	public void doSomething() {
		Runnable r = () -> {
			// This is parent this :)
			System.out.println(this);
			System.out.println(toString());
		};
		r.run();
	}

	@Override
	public String toString() {
		return "Hello's custom toString()";
	}

}

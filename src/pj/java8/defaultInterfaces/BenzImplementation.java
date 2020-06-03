package pj.java8.defaultInterfaces;

public class BenzImplementation implements CarInterface {

	public static void main(String[] args) {

		BenzImplementation benzInstance = new BenzImplementation();
		System.out.println(benzInstance);

	}

	@Override
	public String moveForward() {
		return " moveForward";

	}

	@Override
	public String moveBack() {
		return " \n moveBack";
	}

	@Override
	public String toString() {
		System.out.println(
				" ** Benze does not know of autoDrivingMode option but can use their default implementation anytime they want to and will get the following result"+ this.autoDrivingMode() + "** ");
		return CarInterface.supportsMessage() + this.moveForward() + this.moveBack();
	}

}

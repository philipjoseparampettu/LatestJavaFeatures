package pj.java8.defaultInterfaces;

/**
 * Tesla wanted to enforce all its software to have their own implementation of
 * autoDrivingMode (traditional interface) So created this abstract class which
 * all their implementations will have to follow * @author philip
 *
 */
public abstract class AbstractTesla implements CarInterface {

	@Override
	public String moveForward() {
		return "Tesla moveForward";

	}

	@Override
	public String moveBack() {
		return " Tesla moveBack";
	}

	@Override
	public abstract String autoDrivingMode();

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return "Methods invoked : " + this.moveForward() + this.moveBack() + this.autoDrivingMode();
	}

}

package pj.java8.defaultInterfaces;

public class TeslaImplentation implements CarInterface {

	public static void main(String[] args) {
		
		TeslaImplentation teslaInstance = new TeslaImplentation();
		
		System.out.println(teslaInstance);
		
	}

	@Override
	public String moveForward() {
		return "Tesla moveForward";
		
	}

	@Override
	public String moveBack() {
		return " \n Tesla moveBack";
	}
	
	@Override
	public String autoDrivingMode() {
		return " \nTesla implementation of auto driving";
	};
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return CarInterface.supportsMessage() + this.moveForward() + this.moveBack() +this.autoDrivingMode();
	}
	

}

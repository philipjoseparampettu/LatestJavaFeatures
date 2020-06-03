package pj.java8.defaultInterfaces;

public class BMWImplementation implements CarInterface {

	public static void main(String[] args) {
		
		BMWImplementation bmwInstance = new BMWImplementation();
		
		System.out.println(bmwInstance);
		
	}

	@Override
	public String moveForward() {
		return "BMW moveForward";
		
	}

	@Override
	public String moveBack() {
		return "\n BMW moveBack";
	}
	
	@Override
	public String autoDrivingMode() {
		return "\n BMW autoDrivingModeCustomized";
	}
	
	@Override
	public String toString() {
		
		return CarInterface.supportsMessage() + this.moveForward() + this.moveBack() +this.autoDrivingMode();
	}
	

}

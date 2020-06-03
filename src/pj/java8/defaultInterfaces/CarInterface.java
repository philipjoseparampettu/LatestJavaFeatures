package pj.java8.defaultInterfaces;

public interface CarInterface {
	public String carName = "";

	String moveForward();

	/**
	 * Test Java Doc
	 * 
	 * @return
	 */
	String moveBack();

	/**
	 * This method was introduced later in the stage and hence the method made
	 * default.
	 * 
	 * <ul>
	 * <li>It does not force all other companies e.g Benz to change their API -
	 * change any interface would force others implementing the interface to change
	 * their API immediately or else contract is broken between interface and API,
	 * this would not be fair for others that were not prepared for this
	 * feature</li>
	 * <li>Gives default implementation for Benz to use (if they want to)</li>
	 * <li>BMW who had requested for this feature can write its own implementation
	 * if they wish to</li>
	 * <li>By putting the method in the interface rather than a static class, we are
	 * informing every one that this is a key feature to be implemented by any
	 * one</li>
	 * </ul>
	 */
	default String autoDrivingMode() {
		return "Method3";
	}

	static String supportsMessage() {
		return " This car supports the following functionalities : ";
	}
}

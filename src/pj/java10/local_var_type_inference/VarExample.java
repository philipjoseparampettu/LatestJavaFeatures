package pj.java10.local_var_type_inference;

import java.util.List;

public class VarExample {

	// var firstName; //Not allowed as class fields

	// public Application(var param){ //Not allowed as parameter

	// }

	/*
	 * try{
	 * 
	 * } catch(var ex){ //Not allowed as catch formal
	 * 
	 * }
	 */

	/*
	 * public var demoMethod(){ //Not allowed in method return type return null; }
	 */

	/*
	 * public Integer demoMethod2( var input ){ //Not allowed in method parameters
	 * return null; }
	 */
	/**
	 * var type is inferred by JDK. This is mostly used for internal systems like
	 * below
	 * 
	 * @param args
	 */
	@SuppressWarnings("preview")
	public static void main(String[] args) {
		var blogName = "java.com";
		var testingIfVarAllowedHere = blogName; // allowed for in variable declaration
		List<String> dataList = List.of("name1", "name2");
		for (var object : dataList) { // allowed for enhanced for loop
			System.out.println(object);
		}

		for (var i = 0; i < dataList.size(); i++) {
			System.out.println(dataList.get(i));
		}

		System.out.println(blogName + testingIfVarAllowedHere);
		String whatsNew = """

				NB  * Var can be used instead of specifying the exact type. *
				1. This is legal only where code can identify which type it is meant to be.
				2. Eclipse will give docs, auto filling and content assist to explain which
				*""";
		System.out.println(whatsNew);
	}

}

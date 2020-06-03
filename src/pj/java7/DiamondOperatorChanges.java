package pj.java7;

import java.util.HashMap;
import java.util.Map;

public class DiamondOperatorChanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Old style 
		Map<String, Integer> paramPreJava7 = new HashMap<String, Integer>();
		
		// Java 7 style
		Map<String, Integer> paramJava7s = new HashMap();
		
		System.out.println(" Less verbose because Generics is derived from existing code instead of being explicitily written");

	}

}

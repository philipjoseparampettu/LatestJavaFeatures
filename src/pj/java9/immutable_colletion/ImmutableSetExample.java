package pj.java9.immutable_colletion;

import java.util.Set;

public class ImmutableSetExample {
	public static void main(String[] args) {
        Set<String> names = Set.of("Lokesh", "Amit", "John");
         
        //Elements order not fixed
        System.out.println(names);
         
        //names.add("Brian"); //UnsupportedOperationException occured
         
        //java.lang.NullPointerException
        //Set<String> names2 = Set.of("Lokesh", "Amit", "John", null); 
         
        //java.lang.IllegalArgumentException
        //Set<String> names3 = Set.of("Lokesh", "Amit", "John", "Amit"); 
    }
}

package pj.java9.immutable_colletion;

import java.util.Map;

public class ImutableMapExample {
	public static void main(String[] args) {
        Map<String, String> names = Map.ofEntries(
                Map.entry("1", "Lokesh"),
                Map.entry("2", "Amit"),
                Map.entry("3", "Brian"));
         
        System.out.println(names);
         
        //UnsupportedOperationException
        //names.put("2", "Ravi");
    }
}

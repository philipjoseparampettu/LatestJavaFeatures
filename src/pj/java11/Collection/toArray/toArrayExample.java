package pj.java11.Collection.toArray;

import java.util.ArrayList;
import java.util.List;

public class toArrayExample {
	public static void main(String[] args) 
    {
        List<String> names = new ArrayList<>();
        names.add("alex");
        names.add("brian");
        names.add("charles");
 
        String[] namesArr1 = names.toArray(new String[names.size()]); //Before Java 11
 
        String[] namesArr2 = names.toArray(String[]::new);//Since Java 11
        
        for (String string : namesArr1) {
        	System.out.println(string);
		}
        
        System.out.println("***********");
        for (String string : namesArr2) {
        	System.out.println(string);
		}
        
    }
}

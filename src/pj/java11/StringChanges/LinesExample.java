package pj.java11.StringChanges;

import java.util.ArrayList;
import java.util.List;

public class LinesExample {
	public static void main(String[] args) 
    {
        String testString = "hello\nworld\nis\nexecuted";
 
        List<String> lines = new ArrayList<>();
 
        testString.lines().forEach(line -> lines.add(line));
 
        for (String string : lines) {
        	System.out.println(string);
		}
        
        //assertEquals(List.of("hello", "world", "is", "executed"), lines);
    }
}

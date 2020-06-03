package pj.java11.StringChanges;

public class IsBlankExample {
	public static void main(String[] args) 
    {
        System.out.println("1".isBlank());  //false
 
        System.out.println("".isBlank()); //true
 
        System.out.println("    ".isBlank()); //true
    }
}

package pj.java11.StringChanges;

/**
 * 
 * {@link https://stackoverflow.com/questions/51266582/difference-between-string-trim-and-strip-methods-in-java-11}
 * @author philip
 *
 */
public class StripExample {

    public static void main(String[] args) 
    {
       System.out.println("   hi  *".strip());   //"hi"
 
       System.out.println("   hi  *".stripLeading());  //"hi   "
 
       System.out.println("   hi  *".stripTrailing()); //"   hi"
    }
}

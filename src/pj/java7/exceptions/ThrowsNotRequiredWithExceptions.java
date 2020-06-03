package pj.java7.exceptions;
/**
 * Looks like we are moving away from checked exceptions.
 * @author philip
 *
 */
public class ThrowsNotRequiredWithExceptions {
	 
    public static void main(String[] args)
    {
            sampleMethod();
    }
 
    public static void sampleMethod()
                    //throws Throwable  //No need to do this any more
    {
        try
        {
            //Do some processing which throws NullPointerException; I am sending directly
            throw new NullPointerException();
        }
        //You can catch multiple exceptions added after 'pipe' character
        catch(NullPointerException | IndexOutOfBoundsException ex)
        {
        	System.out.println(" Multiple exceptions caught in the same block, if they are to do processing the same way (See source code)"
        			+ " similarly throws clause is not required any more");
            //throw ex;
        }
        //Now method sampleMethod() do not need to have 'throws' clause
        catch(Throwable ex)
        {
        	System.out.println(" Multiple exceptions caught in the same block, if they are to do processing the same way (See source code)"
        			+ " similarly throws clause is not required any more");
            //throw ex;
        }
    }
}

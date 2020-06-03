package pj.java7.exceptions;

public class MultipleExceptionsInCatchBlock {
	 
    public static void main(String[] args)
    {
            sampleMethod();
    }
 
    public static void sampleMethod()
                    //throws Throwable  //No need to do this any more
    {
        try
        {
            //Do some processing which throws IndexOutOfBoundsException; I am sending directly
            throw new IndexOutOfBoundsException();
        }
        //You can catch multiple exceptions added after 'pipe' character
        catch(NullPointerException | IndexOutOfBoundsException ex)
        {
        	System.out.println(" Multiple exceptions caught in the same block, if they are to do processing the same way (See source code)"
        			+ " similarly throws clause is not required any more");
        }
        
    }
}

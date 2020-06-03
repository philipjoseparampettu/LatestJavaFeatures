package pj.java7.resourceManagement.suppressedExceptions;

public class DirtyResource implements AutoCloseable
{
    /**
     * Need to call this method if you want to access this resource
     * @throws RuntimeException no matter how you call this method
     * */
    public void accessResource()
    {
        throw new RuntimeException("Exception thrown when accessing the resource !!!");
    }
 
    /**
     * The overridden closure method from AutoCloseable interface
     * @throws Exception which is thrown during closure of this dirty resource
     * */
    @Override
    public void close() throws Exception
    {
        throw new NullPointerException("Null pointer exception when closing the resource!!");
    }
}
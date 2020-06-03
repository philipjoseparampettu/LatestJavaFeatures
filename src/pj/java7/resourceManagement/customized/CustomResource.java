package pj.java7.resourceManagement.customized;

public class CustomResource implements AutoCloseable 
{
    public void accessResource() {
        System.out.println("Accessing the resource");
    }
     
    @Override
    public void close() throws Exception {
        System.out.println("CustomResource closed automatically");
    }
}

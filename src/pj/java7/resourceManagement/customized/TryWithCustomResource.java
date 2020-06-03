package pj.java7.resourceManagement.customized;

public class TryWithCustomResource 
{
    public static void main(String[] args)
    {
        try(CustomResource cr = new CustomResource())
        {
            cr.accessResource();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
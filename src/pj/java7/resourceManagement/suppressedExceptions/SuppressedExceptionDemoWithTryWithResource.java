package pj.java7.resourceManagement.suppressedExceptions;

public class SuppressedExceptionDemoWithTryWithResource
{
   /**
    * Demonstrating suppressed exceptions using try-with-resources
    */
   public static void main(String[] arguments) throws Exception
   {
      try (DirtyResource resource= new DirtyResource())
      {
          resource.accessResource();
      }
   }
}

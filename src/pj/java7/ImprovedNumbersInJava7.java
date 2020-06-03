package pj.java7;

public class ImprovedNumbersInJava7 {
	
	public static void main(String[] args)
    {
        /**
         * Supported in int
         * */
        int improvedInt = 10_00_000;
 
        /**
         * Supported in float
         * */
        float improvedFloat = 10_00_000f;
 
        /**
         * Supported in long
         * */
        float improvedLong = 10_00_000l;
 
        /**
         * Supported in double
         * */
        double improvedDouble = 10_00_000d;
        
        System.out.println(" for readablility we can add _ between digits (See source code). This ultimately becomes the orignal values only after compiling \n improvedInt : " +improvedInt+
        		"\n improvedFloat : "+improvedFloat+
        		"\n improvedLong : "+improvedLong+
        		"\n improvedDouble : "+improvedDouble);
        
    }

}

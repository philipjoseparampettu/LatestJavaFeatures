package pj.java7;

public class StringSupportedInSwitch {
	 
    public static void main(String[] args) 
    {
        System.out.println(getExpendedMessage("one"));
        System.out.println(getExpendedMessage("two"));
        System.out.println("Change here is \n"
        		+ "1. String values of switch instead of only enum or int"
        		+ "2. Clubing together of multiple cases" );
    }
 
    static String getExpendedMessage(final String token) 
    {
        String value = null;
 
        switch (token) 
        {
            case ("one"):
            case ("three"):
                value = "Odd token identified";
                break;
     
            case ("two"):
            case ("four"):
                value = "Even token identified";
                break;
     
            default:
                value = "No token was identified";
        }
 
        return value;
    }
}

package pj.java11.optional;

import java.util.Optional;

public class IsEmptyExample {
	public static void main(String[] args) 
    {
        String currentTime = null;
 
        System.out.println(!Optional.ofNullable(currentTime).isPresent());  //It's negative condition
        System.out.println(Optional.ofNullable(currentTime).isEmpty());     //Write it like this
 
        currentTime = "12:00 PM";
 
        System.out.println(!Optional.ofNullable(currentTime).isPresent()); //It's negative condition
        System.out.println(Optional.ofNullable(currentTime).isEmpty());    //Write it like this
    }
}

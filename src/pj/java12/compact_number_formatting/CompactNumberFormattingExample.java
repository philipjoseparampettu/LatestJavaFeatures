package pj.java12.compact_number_formatting;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CompactNumberFormattingExample {
	public static void main(String[] args) throws ParseException 
    {
        NumberFormat fmtlong = NumberFormat
                .getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        System.out.println( "Long format example " );
        System.out.println( fmtlong.format(100) );
        System.out.println( fmtlong.format(1000) );
        System.out.println( fmtlong.format(10000) );
        System.out.println( fmtlong.format(100000) );
 
        NumberFormat fmtShort = NumberFormat
                .getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        System.out.println( "Short format example " );
        System.out.println( fmtShort.format(100) );
        System.out.println( fmtShort.format(1000) );
        System.out.println( fmtShort.format(10000) );
        System.out.println( fmtShort.format(100000) );
        
        NumberFormat fmtFractionDigits = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        fmtFractionDigits.setMinimumFractionDigits(3);
        System.out.println( "Fraction Digits format example " );
        System.out.println( fmtFractionDigits.format(10000) );
        System.out.println( fmtFractionDigits.format(10012) );
        System.out.println( fmtFractionDigits.format(100201) );
        System.out.println( fmtFractionDigits.format(1111111) );
        
        NumberFormat fmt = NumberFormat
                .getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        System.out.println( "Long Parse example " );
        System.out.println( fmt.parse("100") );
        System.out.println( fmt.parse("1 thousand") );
        System.out.println( fmt.parse("10 thousand") );
        System.out.println( fmt.parse("100 thousand") );
    }
}

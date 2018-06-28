package axm09;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        
        String capitalize = StringUtils.capitalize("test data");
        System.out.println(capitalize);
        
        String abbr = StringUtils.abbreviate("This is a test data", 10);
        System.out.println(abbr);

        String abbreviated = StringUtils.abbreviate("United nations organization", 16);
        System.out.println(abbreviated);
        

    }
}
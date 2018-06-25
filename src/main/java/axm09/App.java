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
        String abbreviated = StringUtils.abbreviate("United nations organization", 3);
        System.out.println(abbreviated);
        System.out.println("Some code change");
    }
}
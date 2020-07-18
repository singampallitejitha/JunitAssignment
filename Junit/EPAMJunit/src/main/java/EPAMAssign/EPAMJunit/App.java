package EPAMAssign.EPAMJunit;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	Scanner s = new Scanner(System.in) ;
        System.out.println( "Hello World!" );
        String a = s.nextLine() ;
        StringBuild.makeSubString(a) ;
    }
}

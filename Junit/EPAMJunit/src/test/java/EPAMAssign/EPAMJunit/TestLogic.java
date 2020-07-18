package EPAMAssign.EPAMJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLogic {

	 @Test  
	    public void testmakeSubString(){  
	        assertEquals( "BCD",StringBuild.makeSubString("ABCD"));  
	        assertEquals("CD",StringBuild.makeSubString("AACD"));  
	        assertEquals( "BCD",StringBuild.makeSubString("BACD"));  
	        assertEquals("BBAA",StringBuild.makeSubString("BBAA"));  
	        assertEquals("BAA",StringBuild.makeSubString("AABAA"));
	 }  
	

}

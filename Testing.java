package attardattard;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Testing {
	
	private Main h;
	 @Before
	   public void setUp() throws Exception 
	   {
	      h = new Main();
	   }

	@Test
	   public void testHelloEmpty() 
	   {
	      assertEquals(h.getName(),"");
	      assertEquals(h.getMessage(),"Hello!");
	   }

}

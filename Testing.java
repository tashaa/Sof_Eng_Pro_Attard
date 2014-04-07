package attardattard;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {

	@Test
	public void test() {
		Main x = new Main();
		assertEquals(5,x.numberRet());
	}

}

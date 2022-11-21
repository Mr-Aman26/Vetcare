package JunitPackage;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class testAddNum {

	@Test
	public void test() {
		jUnitFunctions Junit = new jUnitFunctions();
		int result = Junit.AddNumbers(57, 64);
		assertEquals(121, result);
	}

}

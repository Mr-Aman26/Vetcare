package JunitPackage;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class testAddstrings {

	@Test
	public void test() {
		jUnitFunctions Junit = new jUnitFunctions();
		String result = Junit.AddStrings("Aman", "Jain");
		assertEquals("AmanJain", result);
	}

}

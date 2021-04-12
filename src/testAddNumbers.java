import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class testAddNumbers {

	private jUnitTesting unitTest;

	@BeforeEach
	public void setup() throws Exception {
		unitTest = new jUnitTesting();
	}

	@Test
	@DisplayName("Simpple addition should work")
	public void testAddition() {
		assertEquals(999999999, unitTest.addNumbers(1, 999999998), "Regular addition should work");
		assertEquals(99999999, unitTest.addNumbers(1, 999999997), "Regular addition should work");
	}

	@RepeatedTest(5)
	@DisplayName("Ensure correct handling og zero")
	public void testAdditionWithZero() {
		long num = (long) (Math.random() * 100000000);
		assertEquals(num, unitTest.addNumbers(0, num), "Additon of a number with zero should be the same number");
	}

}

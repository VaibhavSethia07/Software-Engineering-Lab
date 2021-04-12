import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class testAddStrings {

	private jUnitTesting unitTest;

	@BeforeEach
	void setUp() throws Exception {
		unitTest = new jUnitTesting();
	}

	@Test
	@DisplayName("Concatenation of simple string shoudl work")
	public void testConcatenation() {
		assertEquals("VaibahvSethia", unitTest.addStrings("Vaibhav", "Sethia"),
				"Concatenation of regular strings should work");
	}

	@Test
	@DisplayName("Ensure correct handling of one empty string")
	public void testOneEmptyString() {
		assertEquals("Vaibhav", unitTest.addStrings("Vaibhav", ""),
				"Concatenation of empty string and non-empty string should result in non empty string");
		assertEquals("Sethia", unitTest.addStrings("", "Sethia"),
				"Concatenation of empty string and non-empty string should result in non empty string");
	}

	@Test
	@DisplayName("Ensure correct handling of two empty strings")
	public void testTwoEmptyString() {
		assertEquals("", unitTest.addStrings("", ""), "Concatenation of empty strings should give empty string");
		assertEquals("E19CSE321", unitTest.addStrings("", ""),
				"Concatenation of empty strings should give empty string");
	}

}

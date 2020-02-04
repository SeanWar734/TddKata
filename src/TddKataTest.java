import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TddKataTest {

	@Test
	void returnsZeroIfEmpty() {
		int actual = TddKata.add("");
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	void returnsPositiveSingleDigit() {
		int actual = TddKata.add("1");
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	void returnsNegativeSingleDigit() {
		int actual = TddKata.add("-1");
		int expected = -1;
		assertEquals(expected, actual);
	}

	@Test
	void retursZeroIfSpace() {
		int actual = TddKata.add(" ");
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	void retursZeroIfMultipleSpaces() {
		int actual = TddKata.add("                ");
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	void oneAndTwo() {
		int actual = TddKata.add("1,2");
		int expected = 3;
		assertEquals(expected, actual);
	}

	@Test
	void twoNumbersOneNegative() {
		int actual = TddKata.add("-1,2");
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	void twoNegatives() {
		int actual = TddKata.add("-1,-2");
		int expected = -3;
		assertEquals(expected, actual);
	}

	@Test
	void hasThreeNumbers() {
		int actual = TddKata.add("1,2,3");
		int expected = 6;
		assertEquals(expected, actual);
	}

	@Test
	void hasThreeNumbersAndSpaces() {
		int actual = TddKata.add("3 ,      2, 3");
		int expected = 8;
		assertEquals(expected, actual);
	}

	@Test
	void hasLetter() {
		int actual = TddKata.add("1a,3");
		int expected = 4;
		assertEquals(expected, actual);
	}

	@Test
	void hasManyLettersAndNumbers() {
		int actual = TddKata.add("1af,f2e,ega3");
		int expected = 6;
		assertEquals(expected, actual);
	}
}

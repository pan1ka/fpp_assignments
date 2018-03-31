package Lab_7_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testFindIt() {
		assertTrue(BinSearch.search("abcdefgjklmnoprstuxyz", 'e'), "found, correct");
	}
	@Test
	void testDontFindIt() {
		assertFalse(BinSearch.search("abcdefgjklmnoprstuxyz", 'i'), "not found, correct");
	}

}

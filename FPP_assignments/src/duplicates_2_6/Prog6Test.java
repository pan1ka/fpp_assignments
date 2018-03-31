package duplicates_2_6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Prog6Test {

	String[] testData1 = {"horse", "dog", "cat", "horse", "dog", "dog", "horse", "dogdog"};
	String[] correctData1 = {"horse", "dog", "cat", "dogdog"};
	
	String[] testData2 = {"horse", "dog", "cat"};
	String[] correctData2 = {"horse", "dog", "cat"};
	
	String[] testData3 = {};
	String[] correctData3 = {};
	
	String[] testData4 = {"horse"};
	String[] correctData4 = {"horse"};
	
	String[] testData5 = {"horse", "fat"};
	String[] correctData5 = {"horse", "fat"};
	
	@Test
	void testRemoveDups() {
		assertTrue(Arrays.equals(Prog6.removeDups(testData1), correctData1), "Two arrays are NOT the same, testData1");
	}
	
	@Test
	void testRemoveDups2() {
		assertTrue(Arrays.equals(Prog6.removeDups(testData2), correctData2), "Two arrays are NOT the same, testData2");
	}
	
	@Test
	void testRemoveDups3() {
		assertTrue(Arrays.equals(Prog6.removeDups(testData3), correctData3), "Two arrays are NOT the same, testData3");
	}
	
	@Test
	void testRemoveDups4() {
		assertTrue(Arrays.equals(Prog6.removeDups(testData4), correctData4), "Two arrays are NOT the same, testData4");
	}
	
	@Test
	void testRemoveDups5() {
		assertTrue(Arrays.equals(Prog6.removeDups(testData5), correctData5), "Two arrays are NOT the same, testData5");
	}
}

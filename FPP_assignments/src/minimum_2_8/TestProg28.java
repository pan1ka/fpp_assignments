package minimum_2_8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestProg28 {
	
	int[] arrayOfInt = new int[]{2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
	int[] arrayOfInt2 = new int[] { 6, 3, 1, 0, -2};
	
	
	@Test
	void test() {
		assertTrue(-22==prog28.min(arrayOfInt), "Problem with -22");
	}
	
	@Test
	void test2() {
		assertTrue(-2==prog28.min(arrayOfInt2), "Problem with -2");
	}
	
	@Test
	void test3() {
		assertFalse(2==prog28.min(arrayOfInt2), "Problem with 2!=-2");
	}

}

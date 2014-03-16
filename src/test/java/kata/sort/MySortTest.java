package kata.sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class MySortTest {

	@Test
	public void emptyList() {
		MySort mySort = new MySortTest();
		assertEquals(list(), mySort(null));
	}

}

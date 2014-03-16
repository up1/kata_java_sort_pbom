package kata.sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class MySortTest {

	@Test
	public void emptyList() {
		MySort mySort = new MySort();
		assertEquals(list(), mySort.sort(null));
	}

	private Object[] list() {
		return null;
	}

}

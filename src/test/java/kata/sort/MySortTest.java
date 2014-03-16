package kata.sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class MySortTest {

	private MySort mySort;

	@Before
	public void setUp() {
		mySort = new MySort();
	}

	@Test
	public void emptyList() {
		assertArrayEquals(list(), mySort.sort(null));
	}

	@Test
	public void emptyList2() throws Exception {
		assertArrayEquals(list(), mySort.sort(list()));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void listofOneShouldReturnListofOne() throws Exception {
		assertArrayEquals(list(1), mySort.sort(list(1)));
	}

	@Test
	public void listOfTwoShouldReturnOrderedList() throws Exception {
		assertArrayEquals(list(1, 2), mySort.sort(list(1, 2)));
	}

	@Test
	public void listOfTwoThatNotOrderShouldReturnOrderedList() throws Exception {
		assertArrayEquals(list(1, 2), mySort.sort(list(2, 1)));
	}
	
	@Test
	public void listOfThreeShouldReturnOrderedList() throws Exception {
		assertArrayEquals(list(1, 2, 3), mySort.sort(list(1, 2, 3)));
	}

	private Object[] list() {
		return null;
	}

	private Object[] list(Object... list) {
		return list;
	}

}

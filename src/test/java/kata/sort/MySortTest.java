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

//	@Test
//	public void listOfThreeShouldReturnOrderedList() throws Exception {
//		assertArrayEquals(list(1, 2, 3), mySort.sort(list(1, 2, 3)));
//	}
//
//	@Test
//	public void listOfThreeShouldReturnOrderedList2() throws Exception {
//		assertArrayEquals(list(1, 2, 3), mySort.sort(list(1, 3, 2)));
//	}
//
//	@Test
//	public void listOfThreeShouldReturnOrderedList_() throws Exception {
//		assertArrayEquals(list(1, 2, 3), mySort.sort(list(2, 1, 3)));
//	}
//
//	@Test
//	public void listOfThreeShouldReturnOrderedList4() throws Exception {
//		assertArrayEquals(list(1, 2, 3), mySort.sort(list(3, 2, 1)));
//	}
//
//	@Test
//	public void listOfFourShouldReturnOrderedList() throws Exception {
//		assertArrayEquals(list(1, 2, 3, 4), mySort.sort(list(4, 3, 2, 1)));
//	}

	private Integer[] list() {
		return null;
	}

	private Integer[] list(Integer... list) {
		return list;
	}

}

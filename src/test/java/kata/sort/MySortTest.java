package kata.sort;

import static org.junit.Assert.*;
import static kata.sort.MySort.list;

import org.junit.Test;

public class MySortTest {

	@Test
	public void emptyList() {
		MySort mySort = new MySort();
		assertEquals(list(), mySort.sort(null));
	}

	@Test
	public void emptyList2() throws Exception {
		MySort mySort = new MySort();
		assertEquals(list(), mySort.sort(list()));
	}

	@Test
	public void listofOneShouldReturnListofOne() throws Exception {
		MySort mySort = new MySort();
		assertEquals(list(1), mySort.sort(list(1)));
	}
	
	@Test
	public void listOfTwoShouldReturnOrderedList() throws Exception {
		MySort mySort = new MySort();
		assertEquals(list(1,2), mySort.sort(list(1,2)));
	}

}

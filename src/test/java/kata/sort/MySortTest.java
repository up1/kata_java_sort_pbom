package kata.sort;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

public class MySortTest {

	@Test
	public void emptyList() {
		MySort mySort = new MySort();
		assertEquals(new ArrayList<Object>(), mySort.sort(new ArrayList<Object>()));
	}

}

class MySort {
	public List<Object> sort(List<Object> l) {
		return new ArrayList<Object>();
	}
}

package kata.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class MySort {

	public Integer[] sort(Integer[] numbers) {
		if (numbers != null && numbers.length > 1) {
			return sort(Arrays.asList(numbers)).toArray(new Integer[numbers.length]);
		}
		return numbers;
	}

	private List<Integer> sort(List<Integer> numbers) {
		if( numbers.size() == 0 ) return numbers;
		
		Integer firstValue = numbers.get(0);
		List<Integer> firstHalfList = new ArrayList<Integer>();
		List<Integer> secondHalfList = new ArrayList<Integer>();

		for (Integer number : numbers) {
			if (number < firstValue) {
				firstHalfList.add(number);
			} else if (number > firstValue) {
				secondHalfList.add(number);
			}
		}
		return makeResultList(sort(firstHalfList), firstValue, sort(secondHalfList));
	}

	private List<Integer> makeResultList(List<Integer> leftList, Integer midNumber, List<Integer> rightList) {
		List<Integer> resultList = new ArrayList<Integer>();
		resultList.addAll(leftList);
		resultList.add(midNumber);
		resultList.addAll(rightList);
		return resultList;
	}
}

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
		List<Integer> lowerFirstValueList = getLowerValueList(numbers, firstValue);
		List<Integer> higherFirstValueList = getHigherValueList(numbers, firstValue);

		return makeResultList(sort(lowerFirstValueList), firstValue, sort(higherFirstValueList));
	}

	private List<Integer> makeResultList(List<Integer> leftList, Integer midNumber, List<Integer> rightList) {
		List<Integer> resultList = new ArrayList<Integer>();
		resultList.addAll(leftList);
		resultList.add(midNumber);
		resultList.addAll(rightList);
		return resultList;
	}

	private List<Integer> getLowerValueList (List<Integer> numbers, Integer compareValue) {
		List<Integer> lowerValueList = new ArrayList<Integer>();
		for (Integer number : numbers) {
			if (number < compareValue) {
				lowerValueList.add(number);
			}
		}
		return lowerValueList;
	}

	private List<Integer> getHigherValueList (List<Integer> numbers, Integer compareValue) {
		List<Integer> higherValueList = new ArrayList<Integer>();
		for (Integer number : numbers) {
			if (number > compareValue) {
				higherValueList.add(number);
			}
		}
		return higherValueList;
	}
}

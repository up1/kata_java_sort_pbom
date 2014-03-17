package kata.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MySort {

	private static final Integer HIGHER_THAN = 1;
	private static final Integer LOWER_THAN = -1;

	public Integer[] sort(Integer[] numbers) {
		if (numbers != null && numbers.length > 1) {
			return sort(Arrays.asList(numbers)).toArray(new Integer[numbers.length]);
		}
		return numbers;
	}

	private List<Integer> sort(List<Integer> numbers) {
		if( numbers.size() == 0 ) return numbers;
		
		Integer firstValue = numbers.get(0);
		List<Integer> lowerFirstValueList = getMatchValueList(numbers, LOWER_THAN, firstValue);
		List<Integer> higherFirstValueList = getMatchValueList(numbers, HIGHER_THAN, firstValue);

		return makeResultList(sort(lowerFirstValueList), firstValue, sort(higherFirstValueList));
	}

	private List<Integer> getMatchValueList (List<Integer> numbers, Integer matchingCriteria, Integer matchingValue) {
		List<Integer> returnValueList = new ArrayList<Integer>();
		for (Integer number : numbers) {
			if(isMatchOnMatcher(number, matchingCriteria, matchingValue))
				returnValueList.add(number);
		}
		return returnValueList;
	}

	private boolean isMatchOnMatcher (Integer number, Integer matchingCriteria, Integer matchingValue) {
		return (matchingCriteria == HIGHER_THAN) ? (number > matchingValue) : (number < matchingValue);
	}

	private List<Integer> makeResultList(List<Integer> leftList, Integer midNumber, List<Integer> rightList) {
		List<Integer> resultList = new ArrayList<Integer>();
		resultList.addAll(leftList);
		resultList.add(midNumber);
		resultList.addAll(rightList);
		return resultList;
	}

}

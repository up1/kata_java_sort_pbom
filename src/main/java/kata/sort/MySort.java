package kata.sort;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang.ArrayUtils;

public class MySort {

    public Integer[] sort(Integer[] numbers) {
        if (numbers != null && numbers.length > 1) {
        	Integer firstValue = numbers[0];

        	List<Integer> firstHalfList = new ArrayList<Integer>();	
        	List<Integer> secondHalfList = new ArrayList<Integer>();

        	for (Integer number : numbers) {
        		if (number < firstValue) {
        			firstHalfList.add(number);
        		} else if (number > firstValue) {
        			secondHalfList.add(number);
        		}
        	}

        	firstHalfList.add(firstValue);

        	Integer[] firstHalfArray = sort(convertIntegerListToArray(firstHalfList));
        	Integer[] secondHalfArray = sort(convertIntegerListToArray(secondHalfList));

        	numbers = (Integer[])ArrayUtils.addAll(firstHalfArray, secondHalfArray);

        }
        return numbers;
    }

    private Integer[] convertIntegerListToArray (List<Integer> integerList) {
		return integerList.toArray(new Integer[integerList.size()]);
    }

}

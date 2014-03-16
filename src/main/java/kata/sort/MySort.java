package kata.sort;

import java.util.List;
import java.util.ArrayList;

public class MySort {
    public Integer[] sort(Integer[] numbers) {
        if (numbers != null) {
        	if (numbers.length > 1) {
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

	        	Integer[] firstHalfArray = sort(firstHalfList.toArray(new Integer[firstHalfList.size()]));
	        	Integer[] secondHalfArray = sort(secondHalfList.toArray(new Integer[secondHalfList.size()]));

	        	numbers = new Integer[firstHalfArray.length + secondHalfArray.length];

	        	System.arraycopy(firstHalfArray, 0, numbers, 0, firstHalfArray.length) ;
	        	System.arraycopy(secondHalfArray, 0, numbers, firstHalfArray.length, secondHalfArray.length) ;
	        }
        }
        return numbers;
    }

}

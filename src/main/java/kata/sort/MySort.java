package kata.sort;

import java.util.List;
import java.util.ArrayList;

public class MySort {
    public Integer[] sort(Integer[] numbers) {
        if (numbers != null) {
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
        	firstHalfList.addAll(secondHalfList);

        	numbers = (Integer[])firstHalfList.toArray(new Integer[firstHalfList.size()]);

        }
        return numbers;
    }

}

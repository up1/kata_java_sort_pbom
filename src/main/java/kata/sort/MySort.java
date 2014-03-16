package kata.sort;

public class MySort {
    public Integer[] sort(Integer[] numbers) {
    	if (numbers == null || numbers.length == 1)
    		return numbers;

    	Integer[] returnArray = new Integer[numbers.length];
    	if (numbers[0] > numbers[1]) {
    		returnArray[1] = numbers[0];
    		returnArray[0] = numbers[1];
    	} else {
    		returnArray = numbers;
    	}	
    	return returnArray;
    }

}

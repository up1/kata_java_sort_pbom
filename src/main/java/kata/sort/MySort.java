package kata.sort;

public class MySort {
    public Integer[] sort(Integer[] numbers) {
    	if (numbers == null)
    		return null;

    	Integer[] sortedArray = new Integer[numbers.length];

    	Integer position = 0;
   		Integer minValue = 0;

    	for (Integer numberForMin : numbers) {
    		Integer newMinValue = getNewMinValue(numbers, minValue);
			sortedArray[position++] = newMinValue;
			minValue = newMinValue;
    	}
        return sortedArray;
    }

    private Integer getNewMinValue(Integer[] numbers, Integer oldMinValue) {
    	Integer newMinValue = null;
		for (Integer innerNumber : numbers) {
			if (innerNumber > oldMinValue) {
				if (newMinValue == null)
					newMinValue = innerNumber;
				if (innerNumber < newMinValue)
					newMinValue = innerNumber;
			}
		}
		return newMinValue;
    }

}

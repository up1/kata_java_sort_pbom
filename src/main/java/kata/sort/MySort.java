package kata.sort;

public class MySort {
    public Integer[] sort(Integer[] numbers) {
        if (numbers != null) {
            int elementLength = numbers.length - 1;

            for (Integer number : numbers) {
                for (int index = 0; index < elementLength; ++index) {
                    int leftIndex = index, rightIndex = index + 1;
                    if (isGreaterThan(numbers[leftIndex], numbers[rightIndex])) {
                        swap(numbers, leftIndex, rightIndex);
                    }
                }
            }
        }

        return numbers;
    }

    private boolean isGreaterThan(Integer leftNumber, Integer rightNumber) {
        return leftNumber > rightNumber;
    }

    private void swap(Object[] list, Integer leftIndex, Integer rightIndex) {
        Object buf = list[leftIndex];
        list[leftIndex] = rightIndex;
        list[rightIndex] = buf;
    }
}

package kata.sort;

public class MySort {
    public Integer[] sort(Integer[] numbers) {
        if (numbers != null) {
            for (Integer number : numbers) {
                for (int index = 0; index < numbers.length - 1; ++index) {
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

    private void swap(Integer[] list, Integer leftIndex, Integer rightIndex) {
        Integer buf = list[leftIndex];
        list[leftIndex] = rightIndex;
        list[rightIndex] = buf;
    }
}

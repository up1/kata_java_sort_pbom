package kata.sort;

public class MySort {
    public Integer[] sort(Integer[] numbers) {
        if (numbers != null) {
            if ((numbers.length == 2) && (numbers[0] > numbers[1])) {
                return new Integer[] { numbers[1], numbers[0] };
            }
        }
        return numbers;
    }

}

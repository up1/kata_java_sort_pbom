package kata.sort;

public class MySort {
    public Object[] sort(Object[] list) {
        if (list != null) {
            int elementLength = list.length - 1;

            for (Object item : list) {
                for (int index = 0; index < elementLength; ++index) {
                    int leftIndex = index, rightIndex = index + 1;
                    if (isGreaterThan((Integer) list[leftIndex], (Integer) list[rightIndex])) {
                        swap(list, leftIndex, rightIndex);
                    }
                }
            }
        }

        return list;
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

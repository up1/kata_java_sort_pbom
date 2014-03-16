package kata.sort;

public class MySort {
    public MySort() {
    }

    public Object[] sort(Object[] list) {
        if (list == null) {
            return null;
        }
        int listLength = list.length;

        for (int leftIndex = 0; leftIndex < listLength - 1; ++leftIndex) {
            for (int rightIndex = leftIndex + 1; rightIndex < listLength; ++rightIndex) {
                int leftNumber = (Integer) list[leftIndex];
                int rightNumber = (Integer) list[rightIndex];
                if (leftNumber > rightNumber) {
                    list[leftIndex] = rightNumber;
                    list[rightIndex] = leftNumber;
                }
            }
        }

        return list;
    }
}

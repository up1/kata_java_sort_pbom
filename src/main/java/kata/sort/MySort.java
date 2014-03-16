package kata.sort;

public class MySort {
    public Object[] sort(Object[] list) {
        if (list == null) {
            return null;
        }

        int listLength = list.length;
        if (listLength == 2) {
            int leftNumber = (Integer) list[0];
            int rightNumber = (Integer) list[1];
            if (leftNumber > rightNumber) {
                swap(list, 0, 1);
            }
        } else if (listLength == 3) {
            int leftNumber = (Integer) list[1];
            int rightNumber = (Integer) list[2];
            if (leftNumber > rightNumber) {
                swap(list, 1, 2);
            }
        }

        return list;
    }

    private void swap(Object[] list, Integer leftIndex, Integer rightIndex) {
        Integer leftNumber = (Integer) list[leftIndex];
        Integer rightNumber = (Integer) list[rightIndex];

        list[leftIndex] = rightNumber;
        list[rightIndex] = leftNumber;
    }
}

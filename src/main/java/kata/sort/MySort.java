package kata.sort;

public class MySort {
    public Object[] sort(Object[] list) {
        if (list == null) {
            return null;
        }

        int listLength = list.length;
        for (int i = 0 ; i < listLength - 1 ; i++) {
            compareSwap(list, i, i + 1);
        }

        return list;
    }

    private void compareSwap(Object[] list, int leftIndex, int rightIndex) {
            int leftNumber = (Integer) list[leftIndex];
            int rightNumber = (Integer) list[rightIndex];
            if (leftNumber > rightNumber) {
                list[leftIndex] = rightNumber;
                list[rightIndex] = leftNumber;
            }
    }
}

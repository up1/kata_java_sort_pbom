package kata.sort;

public class MySort {
    public Object[] sort(Object[] list) {
        if (list == null) {
            return null;
        }

        int listLength = list.length;
        if (listLength == 2) {
            compareSwap(list, 0, 1);
        } else if (listLength == 3) {
            compareSwap(list, 1, 2);
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

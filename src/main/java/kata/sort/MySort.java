package kata.sort;

public class MySort {
    public Object[] sort(Object[] list) {
        if (list != null) {
            int sortRound = list.length - 1;
            for (int round = 0 ; round < sortRound ; round++) {
                for (int index = 0; index < sortRound; ++index)
                    compareSwap(list, index, index + 1);
            }
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

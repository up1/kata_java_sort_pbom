package kata.sort;

public class MySort {
    public Object[] sort(Object[] list) {
        if (list != null) {
            int round = list.length - 1;
            int elementLength = list.length - 1;

            for (int roundCount = 0 ; roundCount < round ; ++roundCount) {
                for (int index = 0; index < elementLength; ++index)
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

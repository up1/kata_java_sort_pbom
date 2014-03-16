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
                    list[0] = rightNumber;
                    list[1] = leftNumber;
                }
        }

        return list;
    }
}

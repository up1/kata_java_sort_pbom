package kata.sort;

public class MySort {
    public MySort() {
    }

    public Object[] sort(Object[] list) {
        if (isEmptyList(list)) {
            return null;
        }
        if (hasOneElement(list)) {
            return list;
        }
        Object tmp;
        if (moreThanCompare((Integer) list[0], (Integer) list[1])) {
            tmp = list[1];
            list[1] = list[0];
            list[0] = tmp;
        }
        return list;
    }

    private boolean moreThanCompare(Integer a, Integer b) {
        return a > b;
    }

    private boolean isEmptyList(Object[] list) {
        return list == null;
    }

    private boolean hasOneElement(Object[] list) {
        return list.length == 1;
    }
}

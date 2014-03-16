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
        if (moreThanCompare(list[0], list[1])) {
            return swap(list, 0, 1);
        }
        return list;
    }

    private Object[] swap(Object[] list, int i, int j) {
        Object tmp;
        tmp = list[i];
        list[i] = list[j];
        list[j] = tmp;

        return list;
    }

    private boolean moreThanCompare(Object a, Object b) {
        return (Integer) a > (Integer) b;
    }

    private boolean isEmptyList(Object[] list) {
        return list == null;
    }

    private boolean hasOneElement(Object[] list) {
        return list.length == 1;
    }
}

package kata.sort;

public class MySort {
    public MySort() {
    }

    public Object[] sort(Object[] list) {
        if (list == null) {
            return null;
        }
        if (list.length == 1) {
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

}

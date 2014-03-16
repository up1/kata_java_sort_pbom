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
        Integer a = (Integer) list[0];
        Integer b = (Integer) list[1];
        Object tmp;
        if (a > b) {
            tmp = list[1];
            list[1] = list[0];
            list[0] = tmp;
        }
        return list;
    }

}

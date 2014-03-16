package kata.sort;
import static kata.sort.MySort.list;

public class MySort {
    public MySort() {
    }

    public Object[] sort(Object[] elements) {
        if (elements == null) {
            return list();
        }
        return elements;
    }

    public static Object[] list(Object ...elements) {
        return elements;
    }
}

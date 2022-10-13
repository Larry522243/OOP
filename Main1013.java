public class Main1013 {
    public static void main(String[] args) {
        Integer[] integers = { 1, 2, 3, 4, 5 };
        Double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        String[] strings = { "1", "2", "3", "4", "5" };

        printArray(integers);
        printArray(doubles);
        printArray(strings);

        System.out.println(maximum("pear", "apple", "orange"));
        System.out.println(maximum(3, 4, 5));

        Box<Integer> a = new Box<Integer>();
        a.add(10);
        System.out.println(a.get());
        Box<String> b = new Box<String>();
        b.add("20");
        System.out.println(b.get());
    }

    private static <T extends Comparable<T>> T maximum(T i, T j, T k) {
        T max = i;
        if (j.compareTo(max) > 0) {
            max = j;
        }
        if (k.compareTo(max) > 0) {
            max = k;
        }

        return max;
    }

    private static <E> void printArray(E[] array) {
        for (E e : array) {
            System.out.printf("%s ", e);
        }
        System.out.println();
    }
}
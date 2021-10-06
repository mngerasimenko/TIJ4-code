import java.util.*;

public class KinoGenerator {
    static List<String> kinoList = Arrays.asList("A2D2", "C3PO", "Luke", "Weider", "Obiwan", "Java");
    static int pos = 0;

    private static String next() {
        if (pos == kinoList.size()) {
            pos = 0;
        }
        return kinoList.get(pos++);
    }

    public static void main(String[] args) {
        String[] array = new String[10];
        nextAll(array);
        nextAll(new ArrayList<String>());
        nextAll(new LinkedList<String>());
        nextAll(new HashSet<String>());
        nextAll(new LinkedHashSet<String>());
        nextAll(new TreeSet<String>());

    }

    private static void nextAll(String[] array) {
        for (int i = 0; i < 10; i++) {
            array[i] = next();
        }
        System.out.println();
        System.out.println("Array");
        for(String s: array) {
            System.out.print(" " + s);
        }
        pos = 0;
    }

    private static void nextAll(Collection<String> array) {
        for (int i = 0; i < 10; i++) {
            array.add(next());
        }
        System.out.println();
        System.out.println(array.getClass());
        for(String s: array) {
            System.out.print(" " + s);
        }
        pos = 0;
    }


}

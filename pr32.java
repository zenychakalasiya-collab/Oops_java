import java.util.*;

public class Main {
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }
    public static void main(String[] args) {
        LinkedList<Integer> rollNos = new LinkedList<>();
        rollNos.add(201);
        rollNos.add(202);
        rollNos.add(203);
        System.out.println("Search 202: " + searchElement(rollNos, 202));
        System.out.println("Search 210: " + searchElement(rollNos, 210));
        System.out.println();
        LinkedList<String> names = new LinkedList<>();
        names.add("Amit");
        names.add("Riya");
        names.add("Kunal");
        System.out.println("Search Riya: " + searchElement(names, "Riya"));
        System.out.println("Search Neha: " + searchElement(names, "Neha"));
    }
}

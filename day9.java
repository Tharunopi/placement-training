import java.util.*;
public class day9 {
    public static void main(String[] args) {
        Map<Integer, String> a = new HashMap<>();
        a.put(58, "tharun");
        a.put(9, "Harish");
        a.replace(9, "op");
        a.forEach((i, j)->System.out.println(i + " " + j));
    }
}

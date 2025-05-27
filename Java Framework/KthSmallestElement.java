import java.util.ArrayList;
import java.util.Collections;

public class KthSmallestElement {
    public static int kthSmallest(ArrayList<Integer> arr, int k) {
        Collections.sort(arr);
        return arr.get(k-1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(19);
        int k = 2;
        System.out.println("K'th smallest element is " + kthSmallest(arr, k));
    }
}

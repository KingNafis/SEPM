import java.util.LinkedList;

public class LinkedListEquality {
    public static boolean areLinkedListsEqual(LinkedList<?> list1, LinkedList<?> list2) {
        if (list1.size() != list2.size()) return false;
        
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        
        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        
        System.out.println("List1 and List2 are " + (areLinkedListsEqual(list1, list2) ? "equal" : "not equal"));
        System.out.println("List1 and List3 are " + (areLinkedListsEqual(list1, list3) ? "equal" : "not equal"));
    }
}
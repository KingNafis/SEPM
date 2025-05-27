import java.util.PriorityQueue;
import java.util.Comparator;

public class QueueStackWithPQ {
    static class PriorityQueueAsQueue<T> {
        private PriorityQueue<Entry<T>> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.order));
        private int order = 0;
        
        static class Entry<T> {
            int order;
            T value;
            Entry(int order, T value) {
                this.order = order;
                this.value = value;
            }
        }
        
        public void enqueue(T value) {
            pq.add(new Entry<>(order++, value));
        }
        
        public T dequeue() {
            return pq.remove().value;
        }
        
        public boolean isEmpty() {
            return pq.isEmpty();
        }
    }
    
    static class PriorityQueueAsStack<T> {
        private PriorityQueue<Entry<T>> pq = new PriorityQueue<>((e1, e2) -> Integer.compare(e2.order, e1.order));
        private int order = 0;
        
        static class Entry<T> {
            int order;
            T value;
            Entry(int order, T value) {
                this.order = order;
                this.value = value;
            }
        }
        
        public void push(T value) {
            pq.add(new Entry<>(order++, value));
        }
        
        public T pop() {
            return pq.remove().value;
        }
        
        public boolean isEmpty() {
            return pq.isEmpty();
        }
    }

    public static void main(String[] args) {
        // Queue demo
        PriorityQueueAsQueue<Integer> queue = new PriorityQueueAsQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        
        System.out.print("Queue order: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
        
        // Stack demo
        PriorityQueueAsStack<Integer> stack = new PriorityQueueAsStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.print("Stack order: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}

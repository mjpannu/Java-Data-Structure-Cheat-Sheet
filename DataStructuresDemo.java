import java.util.*;

public class DataStructuresDemo {
    public static void main(String[] args) {
        // 1. Array
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        System.out.println("Array: " + Arrays.toString(arr));

        // 2. ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.remove(1);
        System.out.println("ArrayList: " + arrayList);

        // 3. LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("Hello");
        linkedList.addLast("World");
        linkedList.removeLast();
        System.out.println("LinkedList: " + linkedList);

        // 4. HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.remove("A");
        System.out.println("HashMap: " + hashMap);

        // 5. HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hello");
        hashSet.add("World");
        hashSet.remove("Hello");
        System.out.println("HashSet: " + hashSet);

        // 6. Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.pop();
        System.out.println("Stack: " + stack);

        // 7. Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(10);
        queue.remove();
        System.out.println("Queue: " + queue);

        // 8. PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(20);
        priorityQueue.add(10);
        priorityQueue.poll();
        System.out.println("PriorityQueue: " + priorityQueue);

        // 9. TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(10);
        treeSet.remove(5);
        System.out.println("TreeSet: " + treeSet);

        // 10. TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("A", 1);
        treeMap.put("B", 2);
        treeMap.remove("A");
        System.out.println("TreeMap: " + treeMap);

        // 11. LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A", 1);
        linkedHashMap.put("B", 2);
        linkedHashMap.remove("A");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // 12. Deque
        Deque<String> deque = new LinkedList<>();
        deque.addFirst("Hello");
        deque.addLast("World");
        deque.removeLast();
        System.out.println("Deque: " + deque);

        // 13. Vector
        Vector<Integer> vector = new Vector<>();
        vector.add(5);
        vector.add(10);
        vector.remove(1);
        System.out.println("Vector: " + vector);
    }
}

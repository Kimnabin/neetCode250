import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Top_k_frequent_elements {
   public static int[] topKFrequent(int[] nums, int k) {
        //1. dem tan suat xuat hien
        Map<Integer, Integer> map = new HashMap<>();
        for( int num : nums ) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // use a min-heap to keep track of top k elements
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        for (int num : map.keySet()) {
            heap.offer(num);
            if (heap.size() > k) {
                heap.poll(); // remove the least frequent element
            }
        }

        // extract the top k elements from the heap
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }
        return result;
    }
}
class MyHashSet {
    private boolean[] set;

    public MyHashSet() {
        set = new boolean[1000001]; // key <= 10^6
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    public boolean contains(int key) {
        return set[key];
    }
}

// import java.util.*;

// class MyHashSet {
//     private final int SIZE = 1000;
//     private List<Integer>[] buckets;

//     public MyHashSet() {
//         buckets = new ArrayList[SIZE];
//         for (int i = 0; i < SIZE; i++) {
//             buckets[i] = new ArrayList<>();
//         }
//     }

//     private int hash(int key) {
//         return key % SIZE;
//     }

//     public void add(int key) {
//         int h = hash(key);
//         if (!buckets[h].contains(key)) {
//             buckets[h].add(key);
//         }
//     }

//     public void remove(int key) {
//         int h = hash(key);
//         buckets[h].remove(Integer.valueOf(key));
//     }

//     public boolean contains(int key) {
//         int h = hash(key);
//         return buckets[h].contains(key);
//     }
// }


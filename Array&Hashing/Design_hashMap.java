import java.util.Arrays;

public class Design_hashMap {
private int[] map;

    public Design_hashMap() {
        map = new int[1000001];
        Arrays.fill(map, -1);
    }

    public void put(int key, int value) {
        map[key] = value;
    }

    public int get(int key) {
        return map[key];
    }

    public void remove(int key) {
        map[key] = -1;
    }
    
}


// import java.util.*;

// class MyHashMap {
//     // Số lượng bucket (chọn số lớn để giảm va chạm)
//     private static final int SIZE = 10000;
//     private LinkedList<Node>[] buckets;

//     // Node lưu trữ 1 cặp (key, value)
//     private static class Node {
//         int key, value;
//         Node(int k, int v) {
//             key = k;
//             value = v;
//         }
//     }

//     public MyHashMap() {
//         // Khởi tạo mảng buckets, mỗi bucket là 1 danh sách liên kết
//         buckets = new LinkedList[SIZE];
//     }

//     // Hàm băm để đưa key về chỉ số bucket
//     private int hash(int key) {
//         return key % SIZE;
//     }

//     // Thêm hoặc cập nhật giá trị
//     public void put(int key, int value) {
//         int index = hash(key); // tính bucket index
//         if (buckets[index] == null) {
//             buckets[index] = new LinkedList<>();
//         }
//         for (Node node : buckets[index]) {
//             if (node.key == key) {
//                 node.value = value; // nếu key đã tồn tại -> cập nhật
//                 return;
//             }
//         }
//         // nếu chưa có thì thêm mới
//         buckets[index].add(new Node(key, value));
//     }

//     // Lấy giá trị
//     public int get(int key) {
//         int index = hash(key);
//         if (buckets[index] == null) return -1; // chưa có bucket nào ở vị trí này
//         for (Node node : buckets[index]) {
//             if (node.key == key) {
//                 return node.value; // tìm thấy key
//             }
//         }
//         return -1; // không tìm thấy
//     }

//     // Xóa key
//     public void remove(int key) {
//         int index = hash(key);
//         if (buckets[index] == null) return;
//         Iterator<Node> it = buckets[index].iterator();
//         while (it.hasNext()) {
//             if (it.next().key == key) {
//                 it.remove(); // xóa node chứa key
//                 return;
//             }
//         }
//     }
// }

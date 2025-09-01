import java.util.Arrays;

public class Sort_an_array {
    public static int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static int[] sortArray2(int[] arr) {
        int numsLength = arr.length;

        for (int i = 0; i < numsLength; i++) {
            for (int j = i + 1; j < numsLength; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}

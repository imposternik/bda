import java.util.*;

class Test {
    static void countDistinct(int[] arr, int k) {
        for (int i = 0; i <= arr.length - k; i++) {
            Set<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                set.add(arr[j]);
            }

            System.out.println(set.size());
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        countDistinct(arr, 4);
    }
}

package Lesson2;

public class task3 {
    public static void main(String[] args) {
        fillArray();
    }

    private static void fillArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 6) arr[i] *= 2;
            else arr[i] *= 1;
        }
        for (int i : arr) {
            System.out.println(i);

        }
    }
}
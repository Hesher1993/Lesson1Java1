package Lesson2;

public class task2 {
    public static void main(String[] args) {
        fillArray();
    }

    private static void fillArray() {
        int[] arr = new int[8];
        arr[0] = 0;
        for(int i=1;i<arr.length;i++) {
            arr[i] = arr[i-1]+3;




            System.out.println(arr[i]);

        }
    }
}




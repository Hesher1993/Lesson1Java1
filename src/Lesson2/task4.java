package Lesson2;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        for(int i=0;i<arr.length;i++){
            int lastIndex = arr.length - 1;
            arr[i][i]= arr[i][lastIndex - 1]= 1;

            System.out.print(Arrays.toString(arr[i]));
        }
    }
}

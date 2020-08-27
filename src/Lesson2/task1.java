package Lesson2;

public class task1 {
    public static void main(String[] args) {
        int[] arr={0,1,0,1,0,0,1};
        for (int i=0;i<arr.length;i++){
            if(arr[i]==0) arr[i]++;
            else{arr[i]--;}
        }
        for (int i : arr) {
            System.out.println(i);

        }
    }
}

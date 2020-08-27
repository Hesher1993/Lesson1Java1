package Lesson2;

public class Testy {
    public static void main(String[] args) {
        int[][] arr = new int [3][3];
        for (int i=0;i<arr.length;i++){
            for (int j=0,x=arr[i].length;j<arr[i].length;j++,x--){
                if(i==j||i==x-1) arr[i][j]=1;
                System.out.println(arr[i][j] + " ");
            }
        }

    }
}

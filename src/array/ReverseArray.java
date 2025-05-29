package array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 8, 1, 2, 5};
        int size = 7;
        // System.out.println("Reverse Array:"+ swapArray(arr,size));
    }
    public static void swapArray(int []arr, int size){
        int start = 0;
        int end = size-1;
        while(start <= end){
            //    swapArray(arr[start],arr[end]);
            start ++;
            end --;
        }

    }
}

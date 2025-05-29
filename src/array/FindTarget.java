package array;

public class FindTarget {
    public static void main(String[]args) {
        int[] arr = {4, 2, 7, 8, 1, 2, 5};
        int size = 7;
        int target = 8;
        int targetIndex = findTargetIndex(arr, size,target);
        System.out.println( targetIndex );
    }
    public static int findTargetIndex(int[]arr, int size, int target){
        // Linear Search...........
        for(int i = 0; i<size; i++){
            if(arr[i] == target){          //found the value.
                return i;                  // return index
            }
        }
        return -1;
    }
}

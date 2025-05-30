package bst;

public class BinarySearch {
    public static int binarySearch(int arr[], int target){
        int n = arr.length;
        int start =0;
        int end = n-1;

        while(start <= end){
            int mid = (start + end)/2;
            if(target> arr[mid]){
                start = mid +1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }


    public static void main(String[]args){
        int arr[] = {-1,0,3,4,5,9,12};
        int target = 12;
        System.out.println(binarySearch(arr, target));
    }
}

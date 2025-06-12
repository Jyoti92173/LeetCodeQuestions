package array;

public class MergeArray {
    public boolean merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1, k = (m+n)-1;
        while(j >= 0){
            if(i >= 0 && (nums1[i] >= nums2[j])){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        return false;
    }

    public static void main(String[] args) {
        int nums1[]={1,2,3,0,0,0};
        int m = 3;
        int nums2[] = {2,5,6};
        int n = 3;
        MergeArray mergeArray = new MergeArray();
        System.out.println(mergeArray.merge(nums1,m,nums2,n));
    }
}

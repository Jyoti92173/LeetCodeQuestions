package array;

public class DuplicateNumber {
    public int findDuplicate(int[] nums) {
        int len=nums.length;
        int low=1;
        int high=len-1;
        while(low<high){
            int mid=low+(high-low)/2;
            int count=0;
            for(int i=0; i<len; i++){
                if(nums[i]<=mid){
                    count++;
                }
            }
            if(count<=mid){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        DuplicateNumber duplicateNumber= new DuplicateNumber();
        System.out.println(duplicateNumber.findDuplicate(nums));
    }
}

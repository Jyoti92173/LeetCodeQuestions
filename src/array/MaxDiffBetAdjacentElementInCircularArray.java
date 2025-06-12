package array;

public class MaxDiffBetAdjacentElementInCircularArray {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int maxDifference = 0;
        for(int i =0; i<n; i++){
            int numsIndex = (i+1) % n;
            int diff = Math.abs(nums[i] - nums[numsIndex]);
            maxDifference = Math.max(maxDifference,diff);
        }
        return maxDifference;
    }

    public static void main(String[] args) {
        int nums[] ={1,2,4};
        MaxDiffBetAdjacentElementInCircularArray maxDiffBetAdjacentElementInCircularArray= new MaxDiffBetAdjacentElementInCircularArray();
        System.out.println(maxDiffBetAdjacentElementInCircularArray.maxAdjacentDistance(nums));
    }
}

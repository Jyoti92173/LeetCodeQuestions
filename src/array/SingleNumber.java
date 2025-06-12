package array;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int val : nums){
            ans^=val;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={2,2,1};
        SingleNumber sn = new SingleNumber();
        System.out.println(sn.singleNumber(nums));
    }
}

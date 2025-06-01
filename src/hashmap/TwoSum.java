package hashmap;


import java.util.HashMap;

public class TwoSum{
        public int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            int []ans = new int[2];

            HashMap<Integer, Integer> hm = new HashMap<>();

            for(int i=0; i<n; i++) {
                int result=target-nums[i];
                if(hm.containsKey(result)) {
                    ans[0] = hm.get(result);
                    ans[1] = i;
                    return ans;
                }
                hm.put(nums[i], i);
            }
            return ans;
        }
}

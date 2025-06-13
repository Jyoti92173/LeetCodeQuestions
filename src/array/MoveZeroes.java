package array;

public class MoveZeroes {
    public boolean moveZeroes(int[] nums) {
        int len = nums.length;
        int i=0;
        for(int j=0; j<len; j++){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }
        }

        for(int j=i; j<len; j++){
            nums[j] = 0;
        }
        return false;
    }
    public boolean moveZeroes2(int[] nums) {
        int m = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (m == -1 || nums[m] != 0) {
                    m = i;
                }
            } else {
                if (m != -1) {
                    int temp = nums[i];
                    nums[i] = nums[m];
                    nums[m] = temp;
                    m++;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        MoveZeroes zeroes = new MoveZeroes();
        System.out.println(zeroes.moveZeroes(nums));
        System.out.println(zeroes.moveZeroes2(nums));
    }
}

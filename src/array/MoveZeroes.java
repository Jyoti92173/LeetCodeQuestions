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

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        MoveZeroes zeroes = new MoveZeroes();
        System.out.println(zeroes.moveZeroes(nums));
    }
}

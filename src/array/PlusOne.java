package array;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i= n-1; i>=0; i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]++;
                return digits;
            }
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }

    public static void main(String[] args) {
       int[] digits = {1,2,3};
       PlusOne pOne = new PlusOne();
        System.out.println(Arrays.toString(pOne.plusOne(digits)));
    }
}

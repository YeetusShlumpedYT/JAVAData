package Problems;
import java.util.*;

public class missingNumber {
    public static void main(String[] args){
        int[] nums1 = {3,0,2};
        System.out.println(correctedMissingNumber(nums1));
    }
    private static int missingNumber(int[] nums){
        Arrays.sort(nums);
        int num = 0;
        for(int i = 1;i<nums.length;i++){
            if((nums[i] - 1) != nums[i - 1]){
                num = nums[i] - 1;
            }
        }
        return num;
    }
    private static int correctedMissingNumber(int[] nums){
        Arrays.sort(nums);
        for(int i  = 0;i<nums.length;i++){
            if(nums[i] != i){
                return i;
            }
        }

        return nums.length;
    }
}

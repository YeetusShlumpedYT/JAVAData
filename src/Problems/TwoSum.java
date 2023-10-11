package Problems;

import java.util.Arrays;

public class TwoSum {
    //return the two indexes of nums (x, y) where the sum of the two elements = target
    public static int[] twoSum(int[] nums, int target){
        int[] indexes = new int[2];
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(nums[j] + nums[i] == target){
                    indexes[0] = i;
                    indexes[1] = j;
                    return indexes;
                }
            }
        }
        return indexes;
    }
    public static void main(String[] args){
        int[] nums = {1,4,5,6};
        System.out.println(Arrays.toString(twoSum(nums, 7)));
    }
}

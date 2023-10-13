package Problems;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {
    private static List<Integer> lengthOfLIS(int[] nums){
        List<Integer> lisIntegers = new ArrayList<>();
        int currentMax = nums[0];

        lisIntegers.add(currentMax);
        for(int currentNum : nums){
            if(currentNum > currentMax){
                lisIntegers.add(currentNum);
                currentMax = currentNum;
            }
        }
        return lisIntegers;
    }
    public static void main(String[] args){
        int[] nums = {10,9,21,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
}

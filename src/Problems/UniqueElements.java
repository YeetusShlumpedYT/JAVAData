package Problems;

import java.util.*;

public class UniqueElements {
    private static List<Integer> uniqueElements(int[] nums){
        List<Integer> uniqueNumbers = new ArrayList<>();
        for(int num : nums){
            if(!uniqueNumbers.contains(num)){
                uniqueNumbers.add(num);
            }
        }
        return uniqueNumbers;
    }
    public static void main(String[] args){
        int[] nums = {4,5,2,3,1,4,2};
        System.out.println(uniqueElements(nums));
    }
}

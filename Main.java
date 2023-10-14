import java.util.*;

public class Main{
	
	private static List<Integer> returnSumOf(int[] nums, int additive){
		List<Integer> addedList = new ArrayList<>();
		for(int currentNum : nums){
			addedList.add(currentNum + additive);
		}
		return addedList;
	}
	private static boolean isGay(String sentence, String gayWord){
		boolean gay = false;
		if(sentence.contains(gayWord)){
			gay = true;
		}else{
			gay = false;
		}
		return gay;
	}

	public static void main(String[] args){
		System.out.println("Hello World");
		int[] nums = {1,2,3,4,5,6};
		System.out.println(returnSumOf(nums, 10));
		System.out.println(isGay("Balls and big dicks", "big dicks"));
	}
}


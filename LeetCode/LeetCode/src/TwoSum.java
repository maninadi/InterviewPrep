import java.util.*;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice.
	
	Example:
	Given nums = [2, 7, 11, 15], target = 9,
	
	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
 */
public class TwoSum {

	public static void main(String[] args){
		
		int[] nums1 = {2, 7, 11, 15};
		int[] nums2 = {3,2,4};
		int[] nums3 = {-1,-2,-3,-4,-5};
		System.out.println(Arrays.toString(twoSum(nums1,9)));
		System.out.println(Arrays.toString(twoSum(nums2,6)));
		System.out.println(Arrays.toString(twoSum(nums3,-8)));
	}
	
	static int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        
        for(int i=0;i<nums.length;i++){
            int k=target-nums[i];
            if(hm.containsKey(k) && hm.get(k)!=i){
                int[] ret=new int[2];
                ret[0]=hm.get(k);
                ret[1]=i;
                Arrays.sort(ret);
                return ret;
            }
        }
        
        return new int[2];
        
    }
}

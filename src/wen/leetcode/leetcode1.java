package wen.leetcode;


//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
public class leetcode1 {


    public static void main(String[] args){
        int[] input = {1,2,3,4,5};

        twoSum(input,3);

    }



    // Runtime: 23 ms, faster than 37.72% of Java online submissions for Two Sum.
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0 ; i < nums.length ; i ++ ){
            for(int j = i + 1 ; j < nums.length ; j++){
                if(nums[i] + nums[j] == target){
                   result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;

    }

    public int[] twoSumFiveStarsSolution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


}

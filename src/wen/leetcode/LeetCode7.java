package wen.leetcode;

public class LeetCode7 {

    public static void main(String[] args){
        int[] input = {1,2,3,4,5};

        Solution solution = new Solution();
        int x = solution.reverse(123456789);
        System.out.println("reverse = " + x);

    }


    /**
     * 增加整数范围判断
     */
    static class Solution {
        public int reverse(int x) {
            int rev = 0;
            while (x != 0) {
                int pop = x % 10;
                x /= 10;
                if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
                if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
                rev = rev * 10 + pop;
            }
            return rev;
        }
    }

}

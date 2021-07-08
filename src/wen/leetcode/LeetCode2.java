package wen.leetcode;

public class LeetCode2 {




    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode output = new ListNode(0);
            output.val = l1.val + l2.val;

            if (l1.next != null) {
                output.next = new ListNode(l1.next.val + l1.next.val);
            }

            return output;
        }


        private int hasNext(ListNode l){
            if (l.next != null){
                return l.next.val;
            }
            return 0;
        }
    }


    public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
         }
     }


}

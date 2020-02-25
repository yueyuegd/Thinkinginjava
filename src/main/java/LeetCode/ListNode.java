package LeetCode;

/**
 * @author zhangyue95
 * @date 2020/2/18.
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int one = 0;
            int two = 0;
            for (int i = 1; l1.next != null && l2.next != null; ) {
                one += l1.val * i;
                two += l2.val * i;
                l1 = l1.next;
                l1 = l2.next;
                i = i * 10;
            }
            return new ListNode(one + two);
        }
    }
}

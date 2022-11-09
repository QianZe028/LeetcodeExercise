//public class AddTwoNumbers02 {
//
//}
//
//class Solution {
//    // 迭代法
//    public ListNode addTwoNumbers(ListNode l1,ListNode l2 ){
//        int next1 = 0; // 表示是否还需要向下一位进一
//        int total = 0; // 两个单位数的链表的和
//        ListNode head = new ListNode ();
//        ListNode temp = head; // 利用temp 来辅助遍历
//        while (l1 != null && l2 != null){
//            total = l1.val + l2.val + next1;
//            temp.next = new ListNode (total %10); // 是temp 的下一个节点附了值 ， temp指针没动
//            next1 = total /10;
//            l1 = l1.next;
//            l2 = l2.next;
//            temp = temp.next;
//        } // 当 while循环结束后， 至少有一个链表已经遍历完了
//
//        // 情况1 ， l2所在的 空了
//        while (l1 != null){
//            total = l1.val + next1;
//            temp.next= new ListNode(total%10);
//            next1 = total /10;
//            l1= l1.next;
//            temp = temp.next;
//        }
//      // 情况2 ， l1所在的链表空了
//        while (l2 != null){
//            total = l2.val + next1;
//            temp.next =new ListNode(total % 10);
//            next1 = total /10;
//            l2= l2.next;
//            temp = temp.next;
//        }
//
//        // 判断一下最后都走完了， 是否还需要进位
//        if (next1 != 0){
//            temp.next = new ListNode (next1);
//        }
//       return head.next;
//    }
//}
package com.Rahul;

public class SortLLMergeSort {

    public ListNode sortList(ListNode head) {
        if(head == null || head.next ==null ){
            return head;
        }
        ListNode mid=middleNode(head);
        ListNode left= sortList(head);
        ListNode right=sortList(mid);

        return mergeTwoLists(left,right);

    }



    ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 != null && list2 != null){
            if(list1.val < list2.val){
                list1.next=mergeTwoLists(list1.next,list2);
                return list1;
            } else {
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if(list1==null){
            return list2;
        } else {
            return list1;
        }
    }
    ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast != null && fast.next !=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}

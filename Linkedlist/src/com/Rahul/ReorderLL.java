package com.Rahul;

public class ReorderLL {
    public static void main(String[] args) {

    }
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public void reorderList(ListNode head) {
            if(head == null || head.next == null){
                return;
            }
            ListNode mid=middleNode(head);

            ListNode hs=reverseList(mid);
            ListNode hf=head;

            //rearrange
            while(hf !=null && hs != null){
                ListNode temp=hf.next;
                hf.next=hs;
                hf=temp;

                temp=hs.next;
                hs.next=hf;
                hs=temp;

            }

            //next of tail 2
            if(hf != null){
                hf.next = null;
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
        ListNode reverseList(ListNode head) {
            if(head==null){
                return head;
            }
            ListNode prev=null;
            ListNode present= head;
            ListNode fuck=present.next;

            while(present != null){
                present.next=prev;
                prev=present;
                present=fuck;
                if(fuck != null){
                    fuck= fuck.next;
                }
            }
            return prev;
        }
    }
}

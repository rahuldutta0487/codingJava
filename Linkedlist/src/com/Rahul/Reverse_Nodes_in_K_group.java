//package com.Rahul;
//
//public class Reverse_Nodes_in_K_group {
//    public static void main(String[] args) {
//
//    }
//    /**
//     * Definition for singly-linked list.
//     * public class ListNode {
//     *     int val;
//     *     ListNode next;
//     *     ListNode() {}
//     *     ListNode(int val) { this.val = val; }
//     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//     * }
//     */
//    class Solution {
//        public ListNode reverseKGroup(ListNode head, int k) {
//            if (k <= 1 || head == null) {
//                return head;
//            }
//
//            ListNode current = head;
//            ListNode prev = null;
//
//            while (true) {
//                ListNode lastNodeOfPrevPart = prev;
//                ListNode lastNodeOfSubList = current;
//                ListNode next = null;
//
//                // Check if there are enough nodes left to reverse
//                for (int i = 0; i < k && current != null; i++) {
//                    current = current.next;
//                }
//                if (current == null) {
//                    break;
//                }
//                current = lastNodeOfSubList;
//
//                // Reverse the k nodes
//                for (int i = 0; i < k; i++) {
//                    next = current.next;
//                    current.next = prev;
//                    prev = current;
//                    current = next;
//                }
//
//                // Connect with the previous part
//                if (lastNodeOfPrevPart != null) {
//                    lastNodeOfPrevPart.next = prev;
//                } else {
//                    head = prev; // new head of the reversed list
//                }
//
//                lastNodeOfSubList.next = current;
//
//                if (current == null) {
//                    break;
//                }
//
//                prev = lastNodeOfSubList;
//            }
//
//            return head;
//        }
//    }
//}

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1 || head== null){
            return head;
        }
        ListNode present=head;
        ListNode prev=null;

        while(true){

            ListNode last=prev;
            ListNode newEnd=present;

            //reverse between left and right
            ListNode next=present.next;
            for(int i=0; present != null && i< k ;i++){
                present.next=prev;
                prev=present;
                present=next;
                if(next != null){
                    next= next.next;
                }
            }
            if(last != null){
                last.next= prev;
            } else{
                head=prev;
            }
            newEnd.next=present;
            if(present == null){
                break;
            }
            prev=newEnd;


        }
        return head;


    }
}

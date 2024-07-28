package com.Rahul;

public class Reverse_alternative_k {
    public static void main(String[] args) {

    }
    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            if(k<=1 || head== null){
                return head;
            }
            ListNode present=head;
            ListNode prev=null;

            while(present != null){

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
                //skip k nodes
                for (int i = 0; current != null && i < k; i++) {
                    prev=current;
                    current= current.next;

                }
            }
            return head;


        }
    }
}

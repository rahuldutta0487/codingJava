package com.Rahul;

public class Palindrome {
    public static void main(String[] args) {

    }

    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode mid=middleNode(head);
            ListNode headsecond=reverseList(mid);
            ListNode rereverseHead=headsecond;

            //compair both the halfs
            while(head != null && headsecond != null){
                if(head.val != headsecond.val ){
                    break;
                }
                head= head.next;
                headsecond =headsecond.next;

            }



            reverseList(rereverseHead);
            if(head == null || headsecond == null){
                return true;
            } else {
                return false;
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

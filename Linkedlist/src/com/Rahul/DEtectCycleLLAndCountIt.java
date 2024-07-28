package com.Rahul;

public class DEtectCycleLLAndCountIt {
        public int LengthofCycle(LL head) {
            LL fast=head;
            LL slow=head;

            while(fast != null && fast.next != null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast == slow){
                    //calculate the length
                    LL temp=slow;
                    int length=0;
                    do {
                        temp=temp.next;
                        length++;
                    } while(temp != slow);

                    return length;
                }
            }
            return 0;
        }

        //find length of the cycle


}

package com.Rahul;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LL {
    public LL next;
    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size=0;
    }


    //recursion reverse
    private  void reverse(Node node){
        if(node == tail){
            head=tail;
            return;
        }
        reverse(node.next);

        tail.next=node;
        tail=node;
        tail.next=null;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }

        size += 1;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
        } else {
            Node node=new Node(val);
            tail.next=node;
            tail=node;
            size++;        }

    }

    //insert anywhere
    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;

        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;


    }

    //insert using recursion
    public void insertrecur(int val,int index){
        head= insertrecur(val,index,head);
    }
    private Node insertrecur(int val, int index, Node node){
        if(index == 0){
            Node temp=new Node(val, node);
            size++;
            return  temp;
        }
        node.next= insertrecur(val,index-1,node.next);
        return node;
    }

    //merge
    public static LL marge(LL first,LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans=new LL();

        while(f != null && s != null){
            if(f.value<s.value){
                ans.insertLast(f.value);
                f=f.next;
            } else {
                ans.insertLast(s.value);
                s=s.next;
            }

        }
        while (f != null){
            ans.insertLast(f.value);
            f=f.next;
        }
        while (s != null){
            ans.insertLast(s.value);
            s=s.next;
        }

        return ans;
    }
    //over the code



    public int delete1st(){
        int val= head.value;
        head=head.next;

        if(head==null){
            tail = null;

        }
        size--;
        return val;
    }

    public int deleteLat(){
        if(size <= 1){
            return delete1st();
        }
        Node Secondlast=get(size-2);
        int val= tail.value;
        tail=Secondlast;
        tail.next=null;

        return val;
    }
    public int deleteIndex(int index){
        if(index==0){
            return delete1st();
        }
        if(index==size-1){
            return deleteLat();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;

        return val;
    }
    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public Node get(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }

    public void dispalay(){
        Node temp=head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
}
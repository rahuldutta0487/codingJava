class solution {
      private void reverse(Node node){
          if(node == tail){
            head=tail;
            return;
          }

        reverse(node.next);

        tail.next=node;
        tail=node;
        tail.next=null;
      }
  
}

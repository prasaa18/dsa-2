package LinkedList.doublyLin;

public class Node {

    int data;
    Node next;
    Node back;
    Node(int data,Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.back = prev;
    }
   public  Node(int data){
        this.data=data;
        this.next=null;
        this.back=null;

   }


}


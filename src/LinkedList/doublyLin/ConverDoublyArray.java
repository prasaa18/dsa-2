package LinkedList.doublyLin;

public class ConverDoublyArray {
   private static  Node convertArray(int[] arr){

       Node head= new Node(arr[0]);
       Node prev1= head;

       for(int i=1; i<arr.length; i++){
           Node temp= new Node(arr[i],null,prev1);
           prev1.next=temp;
           prev1=temp;
       }
       return  head;
   }


    public static void main(String[] args) {
        int[] arr={2,3,4,5};
        Node head= convertArray(arr);

       print(head);
    }

    private static void print(Node head) {

       while(head!=null)
       {
           System.out.println(head.data);
          head =head.next ;
       }
    }
}

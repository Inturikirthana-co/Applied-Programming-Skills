
class Node{
    int data;
    Node next;
}
class Linkedlist{
    public static void main(String[] args){
        Node n1 =new Node();
        n1.data=100;
        n1.next=null;

        Node n2 = new Node();
        n2.data=200;
        n2.next=n1;

        Node n3 =new Node();
        n3.data=300;
        n3.next=n2;

        Node n4 = new Node();
        n4.data=400;
        n4.next=n3;

        Node n5 =new Node();
        n5.data=500;
        n5.next=n4;

        Node head = n5;
        
        while(head!=null){
 
           System.out.print(head.data+ "==>");
           head=head.next;
        }

           

   }
}


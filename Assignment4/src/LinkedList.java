public class LinkedList {
    static class Node{
        int data;
        Node next ;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    private Node head;
    private Node tail;

    public LinkedList(int data){
        head = new Node(data);
        head.next = null;
        tail = head;
    }

    void addFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    void addLast(int data){
      Node node = new Node(data);
      tail.next = node;
      tail = node;
    }

    void delFirst(){
        if(head == null){
            System.out.print("\nList is Empty");
            return;
        }
        head = head.next;
    }

    void delLast(){
        if(head == null){
            System.out.print("\nList is Empty");
            return;
        }

       Node temp = head;

       while(temp.next.next!=null){
           temp = temp.next;
       }
       temp.next = null;
       tail = temp;
    }

    void display(){
        Node temp = head;

        while(temp!=null){
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.display();
        System.out.print("\n");
        list.addLast(5);
        list.display();
        System.out.print("\n");
        list.delFirst();
        list.display();
        System.out.print("\n");
        list.delLast();
        list.display();
        System.out.print("\n");
        list.addLast(6);
        list.display();
    }


}

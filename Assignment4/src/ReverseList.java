public class ReverseList {
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

    public ReverseList(int data){
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

    void displayReverse(Node list){
        if(list==null){
            return;
        }
        displayReverse(list.next);
        System.out.print(" "+list.data);
    }

    public static void main(String[] args) {
        ReverseList list = new ReverseList(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.display();
        System.out.print("\n");
        list.displayReverse(list.head);
    }
}

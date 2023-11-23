public class CircularList {


    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    private Node tail;


    public CircularList(int data){
        tail = new Node(data);
        tail.next = tail;
    }

    void addFirst(int data){
        Node node = new Node(data);
        if(tail == null){
            tail = node;
            tail.next = tail;
        }

        node.next = tail;
        Node temp = tail;
        while(temp.next!=tail){
            temp = temp.next;
        }
        temp.next = node;
        tail = node;
    }
    void addLast(int data){
        Node node = new Node(data);
        Node temp = tail;

        while(temp.next!=tail){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    void deleteLast(){
        if(tail==null){
            System.out.print("\nList is Empty..");
            return;
        }

        Node temp = tail;
        while(temp.next.next!=tail){
            temp = temp.next;
        }
        temp.next = tail;
    }

    void deleteFirst(){
        Node temp = tail;
        if(tail == null){
            System.out.print("\nList is Empty");
        }
        while(temp.next.next != tail.next){
            temp = temp.next;
        }

        temp.next = tail.next;
        tail = temp.next;
    }

    void display(){
        Node node = tail;
        while(node.next!=tail){
            System.out.print(" "+node.data);
            node = node.next;
        }
        System.out.print(" "+node.data);
    }

    public static void main(String[] args) {
        CircularList list = new CircularList(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.display();
        System.out.print("\n");
        list.addLast(5);
        list.display();
        System.out.print("\n");
        list.deleteFirst();
        list.display();
        System.out.print("\n");
        list.deleteLast();
        list.display();
        System.out.print("\n");
        list.addLast(6);
        list.display();
    }

}

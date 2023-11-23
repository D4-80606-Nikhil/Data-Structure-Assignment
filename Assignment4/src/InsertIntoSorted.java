public class InsertIntoSorted {

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

    public InsertIntoSorted(int data){
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

     void sortedInsertion(int data){
        Node node = new Node(data);
        Node temp = head;

        if(temp.next == null){
            if(node.data < temp.data){
                node.next = temp;
                head = node;
                return;
            }else{
                temp.next = node;
                tail = node;
                return;
            }
        } else{
            while(temp.next!=null && temp.next.data < node.data){
                temp= temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
        return;
    }

    public static void main(String[] args) {
        InsertIntoSorted list = new InsertIntoSorted(1);

        list.sortedInsertion(4);
        list.sortedInsertion(2);
        list.sortedInsertion(6);
        list.display();
    }
}

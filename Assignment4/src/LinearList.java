public class LinearList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    private Node head;
    private Node tail;

    public LinearList(int data){
        head = new Node(data);
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

    void addNodeafterIndex(int index,int data){
        Node node = new Node(data);
        int count = 1;
        Node temp = head;

        while(count != index){
            temp = temp.next;
            count++;
        }

        node.next = temp.next;
        temp.next = node;

    }

    void addNodebeforeIndex(int index,int data){

        Node node = new Node(data);
        int count = 1;
        Node temp = head;

        while(count != index-1){
            temp = temp.next;
            count++;
        }

        node.next = temp.next;
        temp.next = node;
    }

    void display(){
        Node temp = head;

        while(temp!=null){
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinearList list = new LinearList(1);
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
        list.addNodeafterIndex(2,77);
        list.display();
        System.out.print("\n");
        list.delLast();
        list.display();
        System.out.print("\n");
        list.addNodebeforeIndex(3,72);
        list.display();
        System.out.print("\n");
        list.addLast(6);
        list.display();
    }

}

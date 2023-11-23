import java.util.HashMap;
import java.util.Map;

public class CircularStudentList {

    static class Node{
        Student student;
        Node next;

        public Node(){
            next = null;
        }

    }
    private Node head = null;

    void addFirst(){
        if(head == null){
            head = new Node();
            head.student = new Student();
            head.student.accept();
            head.next = head;
        }else{
            Node node = new Node();
            node.student = new Student();
            node.student.accept();
            Node temp = head;

            while(temp.next!=head){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            head = temp.next;
        }
    }

    void addLast(){
        if(head == null){
            head = new Node();
            head.student = new Student();
            head.student.accept();
            head.next = head;
        }else{
            Node node = new Node();
            node.student = new Student();
            node.student.accept();
            Node temp  = head;

            while(temp.next != head){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }

    }

    void deleteBasedonRoll(int rollNo){
        Node temp = head;
        if(temp.student.getRollno()==rollNo){
            Node itr = head;
            while(itr.next!=head){
                itr = itr.next;
            }
            itr.next = itr.next.next;
            head = itr.next;
            return;
        }
        int flag = 0;
        while(temp.next!=head){
            if(temp.next.student.getRollno() == rollNo){
                temp.next = temp.next.next;
                flag = 1;
                break;
            }else{
                flag = 0;
            }
            temp = temp.next;
        }

        if(flag == 0){
            System.out.println("Not Found");
        }

    }

    void displayBasedonStandard(int standard){
      Node temp = head;

      do {
          if (temp.student.getStandard() == standard) {
              System.out.println(temp.student.toString());
          }
          temp = temp.next;
      }while(temp!=head);

    }

    void countBasedonStandard(){
        HashMap<Integer,Integer> standard = new HashMap<>();
        Node temp = head;
        do{
            standard.merge(temp.student.getStandard(),1,(k,V)->(k+V));
            temp = temp.next;
        }while(temp!=head);

        for (Map.Entry<Integer,Integer> itr : standard.entrySet()){
            System.out.println("Standard : "+itr.getKey()+ "  Count : "+itr.getValue());
        }

    }

    void updateMarksbyName(){

    }

    void displayStudentbasedonMarks(){

    }

    void displayAll(){
        Node temp = head;

        do{
            System.out.println(temp.student.toString());
            temp = temp.next;
        }while(temp!=head);
    }

    public static void main(String[] args) {
        CircularStudentList list = new CircularStudentList();
        list.addFirst();
        list.addFirst();
        list.addFirst();
        list.displayBasedonStandard(2);
        list.deleteBasedonRoll(3);
        System.out.println();
        list.displayBasedonStandard(2);
        System.out.println();
        list.displayAll();
        list.countBasedonStandard();

        Student[] arr = new Student[10];


    }

}

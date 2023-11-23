import javax.sound.midi.SysexMessage;

public class LinearQueue {
    int size;
    int front;
    int rear;
    int arr[];

    LinearQueue(int size){
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    boolean enqueue(int element){

        if(front == -1 && rear == -1){
            front = 0;
            rear = 0;
            arr[rear] = element;
        } else if(front==rear+1 && rear+1== front){
           System.out.print("\nQueue is Full...");
           return false;
        }else{
                rear = (rear + 1) % size;
                arr[rear] = element;
        }
        return true;
    }

    boolean dequeue(){
        if(front == -1 && rear == -1){
            System.out.print("\nQueue is Empty..");
            return false;
        }
        front = (front+1)%size;
        return true;
    }

    void traverseQueue(){


        if(front == -1 && rear == -1){
            System.out.print("\nQueue is Empty:...\n");
            return;
        }

        System.out.println("\n_______________");

        if(rear >= front) {
            for (int i = front; i <= rear; i++) {
                System.out.print(" " + arr[i]);
            }
        }
        else{
            for(int i = front;i<arr.length;i++){
                System.out.print(" "+arr[i]);
            }
            for(int i = 0;i<=rear;i++){
                System.out.print(" "+arr[i]);
            }
        }
        return;
    }

    public static void main(String[] args) {
        LinearQueue queue = new LinearQueue(5);
        queue.traverseQueue();
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.enqueue(5);
        queue.enqueue(20);
        queue.enqueue(33);
        queue.traverseQueue();
        queue.dequeue();
        queue.traverseQueue();
        queue.dequeue();
        queue.traverseQueue();
        queue.dequeue();
        queue.traverseQueue();
        queue.enqueue(33);
        queue.traverseQueue();
        queue.enqueue(34);
        queue.traverseQueue();
        queue.enqueue(444);
        queue.traverseQueue();
        queue.enqueue(6);
        queue.traverseQueue();
    }

}

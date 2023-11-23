public class MaximumStack {
    int size;
    int top;

    int[][] arr;
    public MaximumStack(int size){
        arr = new int[size][2];
        top = -1;
        this.size = size;
    }
    int maximunValue() {
        return arr[top][1];
    }

   boolean push(int element){
       if(top == size-1){
           System.out.print("\nCan't push more...");
           return false;
       }
       top++;
       if(arr[top][1] > element) {
           arr[top][0] = element;
           arr[top][1] = arr[top-1][1];
           return true;
       }else{
           arr[top][0]=element;
           arr[top][1] = element;
           return true;
       }
    }

    int pop(){
      if(top == -1) {
          System.out.print("\nCan't Pop More...");
      }
      int temp = arr[top][0];
      top --;
      return temp;
    }

    int peek(){
        return arr[top][0];
    }

    public static void main(String[] args) {
        MaximumStack ms = new MaximumStack(5);

        ms.push(1);
        ms.push(2);
        ms.push(3);
        ms.push(4);
        ms.push(5);
        ms.push(6);
        System.out.println("\n"+ms.maximunValue());
        ms.pop();
        System.out.println(ms.maximunValue());
    }

}

public class DescendingStack {

    int maxSize;
    int top;
    int[] stack;

    public DescendingStack(int size){
        stack = new int[size];
        top = size-1;
    }

    boolean push(int element){
        if(top == -1){
            System.out.print("Can't Push More ;)");
        }else{
            stack[top] = element;
            top--;
            return true;
        }
        return false;
    }

    int pop(){
      if(top != maxSize){
          top++;
      }else{
          System.out.print("Can't Pop More ;)");
      }
        return stack[top];
    }

    int peek(){
        if(top == -1){
            System.out.print("Can't Peek , its too Private there :)");
            return -2;
        }else{
            return stack[top];
        }
    }

    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
         DescendingStack stack = new DescendingStack(5);

         stack.push(5);
         stack.push(6);
         stack.push(2);
         stack.push(1);
         stack.push(3);

         if(stack.push(9)){
             System.out.print("Successfull");
         }else{
             System.out.print("\nNot Successful");
         }


    }
}

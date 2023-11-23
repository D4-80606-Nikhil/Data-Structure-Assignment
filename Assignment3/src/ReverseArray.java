import java.util.Stack;

public class ReverseArray {

    static int[] reverseArr(int []arr){
        Stack<Integer> stack = new Stack<>();

        for(int i = 0;i<arr.length;i++){
            stack.push(arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            arr[i] = stack.pop();
        }
        return arr;
    }
    public static void main(String[] args) {
           int arr[] = {1,2,3,4,5,6,7,8,9};
           int reverseArr[] = reverseArr(arr);

           for(int i=0;i<reverseArr.length;i++){
               System.out.print(" "+reverseArr[i]);
           }

    }
}

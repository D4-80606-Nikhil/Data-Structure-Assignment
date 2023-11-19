import java.util.Scanner;

public class SelectionSort {

    public static int[] selectionSort(int [] arr){


        for(int i = 0;i<arr.length;i++){
            int min = arr[i];
            int minIndex = i;
            for(int j = i;j<arr.length;j++){
                if(min>arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = new int[7];
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Arrays Element : ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

        int sortedArr[] = selectionSort(arr);


        System.out.print("Sorted Array : ");
        for(int i = 0;i<sortedArr.length;i++){
            System.out.print(" "+sortedArr[i]);
        }

    }
}

import java.util.Scanner;

public class DescendingInsertionSort {

    public static int[] insertionSort(int arr[]){

        for(int i = 0;i<arr.length;i++){
            int temp = arr[i];
            int j = i;
            while(j>0 && arr[j-1]<temp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[8];
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Array ELement : ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

        System.out.print("(Use Different Algorithm (Itna faltu kaam krvate))Sorted Array : ");

        int sortedArr[] = insertionSort(arr);

        for(int i = 0;i<sortedArr.length;i++){
            System.out.print(" "+sortedArr[i]);
        }
    }
}

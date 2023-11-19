import java.util.Scanner;

public class decreasingBinarySearch {

    public static void binarySearch(int [] arr , Scanner scn){
        int left = 0;
        int right = arr.length-1;
        int mid = (left+right)>>1;
        int key;
        int flag = 0;
        System.out.println("Enter Key to Find : ");
        key = scn.nextInt();

        while(left<=right){
            if(arr[mid]==key){
                System.out.println("Element found :) ");
                flag = 1;
                break;
            }else {
                flag = 0;
                mid = (left+right)>>1;
                if(arr[mid]<key){
                    right = mid -1;
                }else if(arr[mid]>key){
                    left = mid+1;
                }
            }
        }

        if(flag==0){
            System.out.println("Element Not Found :( ");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int [] arr = new int[5];
        System.out.print("\nEnter Values of Array : ");

        for(int i = 0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        binarySearch(arr,scn);
    }
}

import java.util.Scanner;

public class Comparison {

    public static int  linearSearch(int []arr,Scanner scn){
        int count=1;
        int key,flag=0;
        System.out.print("\n Key to search : ");
        key = scn.nextInt();

        for(int i = 0;i<arr.length;++count,i++) {
            if(key == arr[i]){
                System.out.println("Key Found at : "+i+" index");
                flag = 1;
                break;
            }else {
                flag = 0;
            }
        }

        if(flag==0){
            System.out.println("Element not found :(");
        }

        return count;
    }

    public static int binarySearch(int [] arr , Scanner scn){
        int count=0;
        int left = 0;
        int right = arr.length-1;
        int mid = (left+right)>>1;
        int key;
        int flag = 0;
        System.out.println("Enter Key to Find : ");
        key = scn.nextInt();

        while(left<=right){
           count++;
           if(arr[mid]==key){
               System.out.println("Element found :) ");
               flag = 1;
               break;
           }else {
               flag = 0;
               mid = (left+right)>>1;
               if(arr[mid]>key){
                   right = mid -1;
               }else if(arr[mid]<key){
                   left = mid+1;
               }
           }
        }

        if(flag==0){
            System.out.println("Element Not Found :( ");
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int [] arr = new int[5];
        System.out.print("\nEnter Values of Array : ");

        for(int i = 0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        System.out.println("Number of Comparison to happend to perform for the given Value in Linear Search : "+
                linearSearch(arr,scn));

        System.out.println("Number of Comparison to happend to perform for the given Value in Binary Search : "+
                binarySearch(arr,scn));




    }
}

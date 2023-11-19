import java.util.Scanner;

public class LastOccurence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] arr = new int[10];
        System.out.print("\nEnter Values of Array : ");

        for(int i = 0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        int key,flag=0;
        System.out.print("\n Key to search : ");
        key = scn.nextInt();

        for(int i = arr.length-1;i>=0;i--){
            if(key == arr[i]){
                System.out.println("Key Found at : "+i+" index");
                flag = 1;
                break;
            }else{
                flag = 0;
            }
        }

        if(flag==0){
            System.out.println("Element not found :(");
        }


    }
}

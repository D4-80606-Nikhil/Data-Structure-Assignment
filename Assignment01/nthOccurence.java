import java.util.Scanner;

public class nthOccurence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] arr = new int[10];
        System.out.print("\nEnter Values of Array : ");

        for(int i = 0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        int count = 0;
        int key;
        System.out.print("\n Key to search : ");
        key = scn.nextInt();

        int nthOccurence;
        System.out.println("Enter the nth Occurence : ");
        nthOccurence = scn.nextInt();


        for(int i = 0;i<arr.length;i++){
            if(key == arr[i]){
                count++;
            }
        }

        if(count==nthOccurence){
            System.out.println("Element found;");
        }else{
            System.out.println("Element not found "+nthOccurence+" no of time.");
        }

    }
}

import java.util.*;

public class Rank {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] arr = new int[7];
        System.out.print("\nEnter Values of Array : ");

        for(int i = 0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        Arrays.sort(arr);

        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();

        for(Integer itr :arr){
            if(linkedHashMap.containsKey(itr)){
                linkedHashMap.replace(itr,linkedHashMap.get(itr),linkedHashMap.get(itr)+1);
            }else{
                linkedHashMap.put(itr,1);
            }
        }

        int rank= 0;
        int flag = 0;
        System.out.println("Enter The Element you want to search the rank for it: ");
        int key =scn.nextInt();


        for(Map.Entry<Integer,Integer> itr:linkedHashMap.entrySet()){
            if(itr.getKey() == key){
                rank = rank+itr.getValue();
                System.out.println("Rank : "+rank);
                flag = 1;
                break;
            }else{
                rank = rank+itr.getValue();
                flag = 0;
            }
        }

        if(flag == 0){
             System.out.println("Element you Entered is not Found : )");
        }


    }
}

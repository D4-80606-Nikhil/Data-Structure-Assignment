import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class firstNonRepeating {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] arr = new int[11];

        System.out.println("Enter Array Element : ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();

        for(Integer itr :arr){
            if(linkedHashMap.containsKey(itr)){
                linkedHashMap.replace(itr,linkedHashMap.get(itr),linkedHashMap.get(itr)+1);
            }else{
                linkedHashMap.put(itr,1);
            }
        }
//         int flag=1;
//        linkedHashMap.forEach((x,y)->{
//
//            if(y==1){
//                System.out.println("First Non-Repeating Element : "+x);
//
//            }
//
//        });

        for(Map.Entry<Integer,Integer> itr: linkedHashMap.entrySet()){
             if(itr.getValue()==1){
                 System.out.println("First Non-Repeating Element : "+itr.getKey());
                 break;
             }
        }


    }
}

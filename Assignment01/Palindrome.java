import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        String str;
//        System.out.println("Enter String: ");
//        str = scn.next();
//        int flag = 0;
//
//        for (int i= 0;i<str.length()/2;i++){
//            if(str.charAt(i)==str.charAt(str.length()-i-1)){
//                flag = 1;
//            }else{
//                System.out.println("Not a Palindrome");
//                break;
//            }
//        }
//
//        if(flag == 1){
//            System.out.println("Palindrome");
//        }  //time complexity of this method is O(n)  and space complexity of this method is o(1);


        System.out.println("Enter String : ");
        StringBuffer str  = new StringBuffer(scn.next());
        String originalContent = str.toString();

        StringBuffer revStr = str.reverse();

//        String tempStr = str.toString();
//        String tempRevStr = revStr.toString();

        System.out.println("value of Original Content : "+originalContent);
        System.out.println("value of revstr : "+revStr);

        if((originalContent).equals((revStr.toString()))){
         System.out.println("String is Palindrome ");
        }else{
            System.out.println("String is not Palindrome");
        }
      // by reversing the string the time complexity is again O(n) and space complexity is O(n)

    }
}
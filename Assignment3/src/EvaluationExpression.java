import java.util.Stack;

public class EvaluationExpression {

    int priorities(char optr){
        switch(optr){
            case '+':
            case '-':
                return 1;

            case '/':
            case '*':
                return 2;
        }

        return -1;
    }

    String infixTopostfix(String[] arr){
        String expr=null;
        Stack<String> stack = new Stack<>();
        Stack<String> operator = new Stack<>();

        for(int i = 0;i<arr.length;i++){
            if(arr[i].equals("(")){
                operator.push(arr[i]);
            }else if(arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("*") || arr[i].equals("/")){
               if(operator.isEmpty()) {
                   operator.push(arr[i]);
               } else{
                       while(operator.size()>0 && priorities(arr[i].charAt(0)) <= priorities(operator.peek().charAt(0)) && operator.peek().charAt(0)!='(') {
                           String v2 = stack.pop();
                           String v1 = stack.pop();
                           stack.push((v1 + v2 + operator.pop()));
                       }
                   operator.push(arr[i]);
               }
               }
            else if(arr[i].equals(")")){
                 while(operator.peek().charAt(0)!='('){
                                String v2 = stack.pop();
                                String v1 = stack.pop();
                                stack.push((v1 + v2 + operator.pop()));
                }
                 operator.pop();
            }
             else{
                stack.push(arr[i]);
            }
        }
       if(!operator.isEmpty()){
           String temp2 = stack.pop();
           String temp1 = stack.pop();
           String oper = operator.pop();
           stack.push(temp1+temp2+oper);
       }
        expr = stack.pop();

        return expr;
    }


    String infixToprefix(String[] arr){
        String expr=null;
        Stack<String> stack = new Stack<>();
        Stack<String> operator = new Stack<>();

        for(int i = 0;i<arr.length;i++){
            if(arr[i].equals("(")){
                operator.push(arr[i]);
            }else if(arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("*") || arr[i].equals("/")){
                if(operator.isEmpty()) {
                    operator.push(arr[i]);
                } else{
                    while(operator.size()>0 && priorities(arr[i].charAt(0)) <= priorities(operator.peek().charAt(0)) && operator.peek().charAt(0)!='(') {
                        String v2 = stack.pop();
                        String v1 = stack.pop();
                        stack.push((operator.pop() +v1 + v2));
                    }
                    operator.push(arr[i]);
                }
            }
            else if(arr[i].equals(")")){
                while(operator.peek().charAt(0)!='('){
                    String v2 = stack.pop();
                    String v1 = stack.pop();
                    stack.push((operator.pop()+v1 + v2 ));
                }
                operator.pop();
            }
            else{
                stack.push(arr[i]);
            }
        }
        if(!operator.isEmpty()){
            String temp2 = stack.pop();
            String temp1 = stack.pop();
            String oper = operator.pop();
            stack.push(oper+temp1+temp2);
        }
        expr = stack.pop();

        return expr;
    }



    public static void main(String[] args) {
        String abc = "15 + 9 - 4 * ( 8 - 6 / 2 ) + 23";
        String []ar = abc.split(" ");

        EvaluationExpression expression = new EvaluationExpression();
        String result =   expression.infixTopostfix(ar);
        String resultpre = expression.infixToprefix(ar);

        System.out.print("PostFix Expression : " +result);
        System.out.print("\nPreFix Expression : "+resultpre);

    }
}

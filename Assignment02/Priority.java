public class Priority {

    static int priorityFun(char operator){

        switch (operator) {
            case '$':
                return 11;
            case '-':
            case '+':
                return 9;

            case '*':
            case '/':
                return 10;

        }

        return -1;
    }
    public static void main(String[] args) {

    }
}

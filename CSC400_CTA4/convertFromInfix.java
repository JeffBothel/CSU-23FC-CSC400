import java.util.Stack;

public class convertFromInfix {
    // WORKING NOTE: Comparison that ensures the operator is higher than the one on the stack
    private static boolean isOperatorHigher(char operator1, char operator2) {
        int operator1Weight = -1;
        int operator2Weight = -1;
        switch(operator1){
            case '(':
            case ')':
            case '[': 
            case ']':
            case '{':
            case '}':
                operator1Weight = 6;
                break;
            case '^':
                operator1Weight = 5;
                break;
            case '*':
                operator1Weight = 4;
                break;
            case '/':
                operator1Weight = 3;
                break;
            case '+':
                operator1Weight = 2;
                break;
            case '-':
                operator1Weight = 1;
                break;
        }

        switch(operator2){
            case '(':
            case ')':
            case '[': 
            case ']':
            case '{':
            case '}':
                operator2Weight = 6;
                break;
            case '^':
                operator2Weight = 5;
                break;
            case '*':
                operator2Weight = 4;
                break;
            case '/':
                operator2Weight = 3;
                break;
            case '+':
                operator2Weight = 2;
                break;
            case '-':
                operator2Weight = 1;
                break;
        }

        if(operator1Weight > operator2Weight){
            return true;
        } else {
            return false;
        }
    }

    public static String convertToPostfix(String infix) {
        // Definition of the variables for use in the method
        Stack<Character> operatorStack = new Stack<>();
        // Choosing to work with a second stack that will allow for better handling of the values in the input string
        Stack<Character> infixStack = new Stack<>();
        for(char c : infix.toCharArray()) infixStack.push(c);
        char nextCharacter = ' ';
        char topOperator = ' ';
        String postfix = "";

        // While loop that runs through the various items in the stack
        while(!infixStack.isEmpty()){
            nextCharacter = infixStack.removeFirst();
            switch(nextCharacter){
                case '(':
                case '[':
                case '{':
                case '^':
                case '*':
                case '/':
                case '+':
                case '-':
                case ')':
                case ']':
                case '}':
                    operatorStack.push(nextCharacter);
                    break;
                default:
                    postfix += nextCharacter;
                    break;
            }

            if(Character.isLetterOrDigit(infixStack.peek())) System.out.println("Next character is a letter or digit");
            else System.out.println("Next character is an operator");
            
        }

        return postfix;
    }    
}
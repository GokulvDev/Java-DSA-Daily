package StringPackage;

import java.util.Stack;

public class BalancedParentheses {
    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch == '{' || ch == '[' || ch == '('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;

                char c = stack.peek();

                if(ch == ')' && c != '(' || ch == '}' && c != '{' || ch == ']' && c != '['){
                   return false;
                }

                stack.pop();

            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "[()()]{}";

        System.out.println(isValid(s));

    }
}

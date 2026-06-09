import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "{[()}]}";

        boolean flag = isValidBrute(s);

        System.out.println(flag ? "Valid" : "Not Valid");

        if(isValidOptimal(s)){
            System.out.println("Valid Parentheses");
        }else{
            System.out.println("Not valid");
        }

    }

    private static boolean isValidBrute(String s) {

        while(s.contains("{}") || s.contains("[]") || s.contains("()")){
            s = s.replace("{}","")
                    .replace("[]","")
                    .replace("()","");
        }

        return s.isEmpty();
    }

    public static boolean isValidOptimal(String s){
        Stack<Character> stack = new Stack<>();

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            }else{
                if(stack.isEmpty())
                    return false;

                char ch = stack.peek();

                if((ch == '{' && c != '{' )|| (ch == '[' && c != ']') ||
                        (ch == '(' && c != ')')){
                    return false;
                }

                stack.pop();
             }
         }

        return stack.isEmpty();

    }


}

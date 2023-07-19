import java.util.*;

public class P86 {
    public static boolean isValidParenthesis(String s) {
        Stack<Character> stk = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stk.isEmpty())
                stk.push(c);
            else if (stk.peek() == '{' && c == '}')
                stk.pop();
            else if (stk.peek() == '[' && c == ']')
                stk.pop();
            else if (stk.peek() == '(' && c == ')')
                stk.pop();
            else
                stk.push(c);
        }
        return stk.size() == 0;
    }
}
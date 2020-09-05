package Easy;

import java.util.LinkedList;

/**
 * @author Jialu Hu
 * @create 2020-09-05 15:37
 */
public class IsValid {
    public boolean isValid(String s){
        LinkedList<Character> stack = new LinkedList<>();
        for(char c:s.toCharArray()){
            if(c == '(')
                stack.push(')');
            else if(c == '[')
                stack.push(']');
            else if(c == '{')
                stack.push('}');
            else if(stack.isEmpty() || c != stack.pop())
                return false;
        }
        return stack.isEmpty();
    }
}

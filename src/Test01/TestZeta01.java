package Test01;
//Write the code to determine if  an expression  has balanced parenthesis.
//
//        Input: [{()}]
//        Output: balanced.

import java.util.Stack;

public class TestZeta01 {

    public static void main(String[] args) {
        String str = "[{{(}})]";
        boolean flag = balanced(str);

        if (flag) {
            System.out.println("balanced");
        } else
            System.out.println("Not balanced");

    }

    private static boolean balanced(String str) {
//        boolean result = false;
        char[] ch = str.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[') {
                stack.push(ch[i]);
            } else {
                switch (ch[i]) {
                    case '}':
                        if (stack.pop() == '{') ;
                        break;
                    case ')':
                        if (stack.pop() == '(') ;
                        break;
                    case ']':
                        if (stack.pop() == '[') ;
                        break;

                }
            }
        }

        if (stack.empty()) {
            return true;
        } else return false;
    }
}

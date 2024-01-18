package Test03;

//You have a JSON you need to check wheather it is valid or not
//{{{}}} - valid , {}{}{} - not valid , {{{}}}{} - not valid, {{}{}{}{}} - valid,

//


import java.util.Stack;

public class test {
    public static void main(String[] args) {
        String str = "}{{{";

        System.out.println(validity(str));

    }

    private static String validity(String str) {
        String res = null;
        Stack<Character> stack = new Stack<>();
        char[] ch = str.toCharArray();

        if (str.length() < 2 || (str.length() % 2 != 0)) {
            res = "Invalid";
            return res;
        }

        if (ch[0] == '{') {
            stack.push(ch[0]);
            for (int i = 1; i < ch.length; i++) {
                if (stack.empty()) {
                    res = "Invalid";
                    break;
                } else if (ch[i] == '{') {
                    stack.push(ch[i]);
                } else if (ch[i] == '}') {
                    stack.pop();
                }

            }

        } else {
            res = "Invalid";
        }
        return res;
    }


}

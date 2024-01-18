package Test02;

import java.util.Stack;

public class decodingString {

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        Stack<Integer> is = new Stack<>();
        Stack<String> ss = new Stack<>();
        int ptr = 0;
        String res = "";

        while (ptr < s.length()) {
            char curr = s.charAt(ptr);
            if (Character.isDigit(curr)) {
                int num = 0;
                while (Character.isDigit(s.charAt(ptr))) {
                    num = num * 10 + (s.charAt(ptr) - '0');
                    ptr++;
                }
                is.push(num);
            } else if (curr == '[') {
                ss.push(res);
                res = "";
                ptr++;
            } else if (curr == ']') {
                StringBuilder sb = new StringBuilder(ss.pop());
                int count = is.pop();
                for (int i = 1; i <= count; i++) {
                    sb.append(res);
                }
                res = sb.toString();
                ptr++;

            } else {
                res += curr;
                ptr++;
            }
            System.out.println(res);

        }
        System.out.println(res);
    }

}

package Test01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class longestSubstring {

    public static void main(String[] args) {
        String str = "GEEKSFORG";
        System.out.println(subString(str));
    }

    private static int subString(String str) {

        int a = 0;
        int b = 0;
        int max = 0;
        HashSet<Character> set = new LinkedHashSet<>();
        StringBuilder sb = null;
        while(b< str.length()){
            if(!set.contains(str.charAt(b))){
                sb = new StringBuilder();

                set.add(str.charAt(b));
                max = Math.max(set.size(), max);
                b++;
                for(Character ch: set){
                    sb.append(ch);
                }

            }else{
                set.remove(str.charAt(a));
                a++;
            }
        }
        System.out.println(sb.toString());

        return max;
    }

}

package Test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Check if two strings are k-anagrams or not?
//        String s1 = "Bangalore"
//        String s2= "angareomo"
//        K= 2
//        o/p = yes
//        k=1
//        o/p = n
public class anagram {
    public static void main(String[] args) {
        String s1 = "fodr";
        String s2 = "gork";
        int k = 2;

        if (s1.length() != s2.length()) {
            System.out.println("not anagram");
        }
        int count = 0;
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1) +"  ==  "+ Arrays.toString(ch2));
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            if (ch1[i] != ch2[i]) {
                list.add(ch2[i]);
            }
        }
        System.out.println(list.size());

        if(list.size() <= k){
            System.out.println("yes");
        }else if (k == list.size()){
            System.out.println("no");
        }


    }

}

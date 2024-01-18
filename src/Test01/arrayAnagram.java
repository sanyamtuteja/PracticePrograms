package Test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class arrayAnagram {

    public static void main(String[] args) {
        // Driver program
        String arr[] = {"cat", "dog", "tac", "god", "act"};
        printAnagrams(arr);
    }

    private static void printAnagrams(String arr[]) {
        HashMap<String, List<String>> hmap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            char[] charArr = word.toCharArray();
            Arrays.sort(charArr);

            String newWord = new String(charArr);

            if (hmap.containsKey(newWord)) {
                hmap.get(newWord).add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                hmap.put(newWord, list);
            }

            for(String s: hmap.keySet()){
                List<String> values = hmap.get(s);

            }
        }
    }

}

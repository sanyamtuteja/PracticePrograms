package Test01;

import java.util.*;

public class sortAnagrams {
    public static void main(String args[]) {
        String wordArr[] = {"cat", "dog", "tac", "god", "act"};
        int size = wordArr.length;
        printAnagramsTogether(wordArr, size);
    }

    static void printAnagramsTogether(String arr[], int size) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : arr) {

            String original = s;
            char[] letters = s.toCharArray();
            Arrays.sort(letters);
            String chArr = new String(letters);

            if (!(map.containsKey(chArr))) {
                List<String> list = new ArrayList<>();

                list.add(original);
                map.put(chArr, list);
            } else {
                map.get(chArr).add(original);
            }

        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {

            List<String> list01 = new ArrayList<>();
            list01 = entry.getValue();
            System.out.println(list01);
        }

    }
}
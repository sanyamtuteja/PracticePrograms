package Test01;
//I/P:abcdefghabcdefgabcdefabcdeabcd
//        O/P:abc-5,bcd-5,cde-4,def-,efg,fgh,gha,hab


import java.util.HashMap;
import java.util.Map;

public class testLivspace {

    public static void main(String[] argos) {

        String s = "abcdefghabcdefgabcdefabcdeab";

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length() - 2; i++) {
            String res = s.substring(i, i + 3);
            if (map.containsKey(res)) {
                map.put(res, map.get(res) + 1);
            } else map.put(res, 1);
        }


        int maxValue = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() +"   "+entry.getValue());
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
            }

        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() == maxValue) {
                System.out.println(entry.getKey() +"--- " +entry.getValue());
            }

        }
    }

}

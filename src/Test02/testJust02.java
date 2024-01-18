//package Test02;
//
//import javax.naming.InsufficientResourcesException;
//import java.util.*;
//
//public class testJust02 {
//    public static void main(String[] args) {
//        int[] A = {6, 4, 2, 6, 4, 2, 2};
//        int N = A.length;
//        TreeMap<Integer, Integer> map = new TreeMap<>();
//
//        int ans = 0;
//        int[] result = new int[N];
//        for (int i = 0; i < N; i++) {
//            if (map.containsKey(A[i])) {
//                map.put(A[i], map.get(A[i]) + 1);
//            } else
//                map.put(A[i], 1);
//        }
//
//        for (Map.Entry entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " -- " + entry.getValue());
//            ans =(int) entry.getValue() +ans;
//
//        }
//        int min = map.get(0);
//        int max = map.get(map.size()-1);
//
//
//
//HashSet<Integer> set = new HashSet<>();
//set.to
//    }
//}

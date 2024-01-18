//package Test03;
//
//// find duplicate & missing
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class testjunglee {
//
//
//    public static void main(String[] args) {
//        int[] arr = {2, 4, 6, 5, 5, 1};
//        int missing = 0;
//        int duplicate = 0;
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (map.containsKey(arr[i])) {
//                map.put(arr[i], map.get(arr[i]) + 1);
//            } else {
//                map.put(arr[i], 1);
//            }
//        }
//        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
//            if(entry.getValue() > 1){
//                duplicate = entry.getKey();
//                System.out.println(duplicate);
//            }else if (entry.getKey() != i){
//                missing = i;
//                System.out.println(missing);
//            }
//        }
//
//
//    }
//}

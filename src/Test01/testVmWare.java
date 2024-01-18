//package Test03;
////Print all permutation of ABC
////        input str="ABC";
////        ABC ACB BAC BCA CBA CAB
//
//
//public class testVmWare {
//    public static void main(String[] args) {
//        String s = "ABCD";
//
//        char[] ch = s.toCharArray();
//        for (int i = 0; i < s.length(); i++) {
//            Character c = s.charAt(i);
//            String res = c.toString();
//            for (int j = 0; j < s.length(); j++) {
//                if (i != j) {
//                    res = res + s.charAt(j);
//                }
//            }
//            System.out.println(res);
//            c = s.charAt(i);
//            res = c.toString();
//            for (int j = s.length() - 1; j >= 0; j--) {
//                if (i != j) {
//                    res = res + s.charAt(j);
//                }
//            }
//            System.out.println(res);
//
//        }
//    }
//
//
//    public void permutations(String s, int x, int y) {
//        if (x < s.length()) {
//            return;
//        }
//
//        for (int i = x; i < s.length(); i++) {
//            Character c = s.charAt(i);
//            String res = c.toString();
//            for (int j = 0; j < s.length(); j++) {
//                if (i != j) {
//                    res = res + s.charAt(j);
//                }
//            }
//            System.out.println(res);
//
//        }
//        permutations(s, x + 1, );
//    }
//
//}

package Test01;

//Given a linkedist print its sum?
//        I/p - 7->6->3->2->1
//        o/p - 19
//        sum of nodes:
//        7 + 6 + 3 + 2 + 1 = 19

import java.util.LinkedList;

public class testVVware {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(7);
        list.add(6);
        list.add(3);
        list.add(2);
        list.add(1);

        Integer sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }


}

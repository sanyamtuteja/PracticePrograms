package Test04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testDP {

    public static void main(String[] args) {
        int[] a2 = {1, 2, 2, 3};
int[] a ={2,5,6,10,7,6};
        List<Long> list = new ArrayList<>();

        list.add(0L);
        long count = 0;


        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
                count = 0;
                for (int j = i; j > 0; j--) {
                    int temp = a[i] - a[j - 1];
                    count = count + (Math.abs(temp));
                }
            } else if (a[i] < a[i - 1]) {


                for (int j = i; j > 0; j--) {
                    int temp = a[i] - a[j - 1];
                    count = count - (Math.abs(temp));
                }
            }
//            System.out.println("count" + count);

            list.add(count);
        }


        for (int k = 0; k < list.size(); k++) {
            System.out.println(list.get(k));
        }
    }
}

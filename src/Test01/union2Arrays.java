package Test01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class union2Arrays {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 4, 5, 7};
        int arr2[] = {2, 3, 5, 6};
        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0;
        LinkedList<Integer> list = new LinkedList<>();

        while (i < n && j < m) {
            if (arr1[i] > arr2[j]) {
                if (!list.contains(arr1[i])) {
                    list.add(arr1[i]);
                }
                i++;
            } else if (!list.contains(arr1[j])) {
                list.add(arr1[j]);
            }
            j++;
        }
        while (i < m){
            list.add(arr1[i]);}
        while (j < n){
            list.add(arr1[j]);} 
        System.out.println(list);
    }
}

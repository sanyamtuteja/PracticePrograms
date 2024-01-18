package Test01;

//2) A company is planning to interview 2n people.
//        Given the array costs where costs[i] = [aCosti, bCosti],
//        the cost of flying the ith person to city a is aCosti,
//        and the cost of flying the ith person to city b is bCosti.
//        Return the minimum cost to fly every person to a city
//        such that exactly n people arrive in each city.
//Example 1:
//        Input: costs =
//        [10,20],
//        [30,200],
//        [400,50],
//        [30,20]
//        Output: 110
//        Explanation:
//        The first person goes to city A for a cost of 10.
//        The second person goes to city A for a cost of 30.
//        The third person goes to city B for a cost of 50.
//        The fourth person goes to city B for a cost of 20.
//        The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.
//        Example 2:
//        Input: costs = [[259,770],[448,54],[926,667],[184,139],[840,118],[577,469]]
//        Output: 1859

import java.util.Arrays;
import java.util.Comparator;

public class testGroww01 {

    public static void main(String[] args) {
        int[][] costArr = {{100, 20}, {30, 200}, {100, 50}, {30, 20}};

        System.out.println(method(costArr));

    }

    private static int method(int[][] costArr) {
        int cost = 0;


        Arrays.sort(costArr, (o1, o2) ->
        {
            return (o1[0] - o1[1]) - (o2[0] - o2[1]);
        });

        for (int i = 0; i < costArr.length / 2; i++) {
            cost += costArr[i][0];
        }
        for (int i = costArr.length / 2; i < costArr.length; i++) {
            cost += costArr[i][1];
        }

        return cost;
    }



}

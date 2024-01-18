package Test01;


// Main class should be named 'Solution'
public class buildingHeight {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        int[] arr = {4,2,3};
        int n = arr.length;

        int min = 0;
        int maxVal = arr[0];
        int max = 0;
        int unit = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                min = i;// min = 1
            }
        }

        for (int j = 0; j < min; j++) {
            if (arr[j] > maxVal) {
                maxVal = arr[j]; // 4
                max = j; //0
            }

        }
        for (int k = max; k < n; k++) {
            if (arr[k] < maxVal) {
                unit += maxVal - arr[k];
            }else if((arr[k] < maxVal) && (k ==n-1)){
                unit +=  arr[k] -arr[k-1];
            }
        }

        System.out.println(unit);
//        maxVal = arr[0];
//        //{5,4,2,6,2,4,5};
//        for (int i = 1; i < n; i++) {
//            if (arr[i] < maxVal) {
//                unit += maxVal - arr[i];
//            } else if (arr[i] > maxVal) {
//                maxVal = arr[i];
//            }

//        }


    }
}

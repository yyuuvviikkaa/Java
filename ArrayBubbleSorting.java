import java.util.Arrays;

public class ArrayBubbleSorting {
    public static void main(String[] args) {
        int[] arr = { 2, 7 ,8, 6, 0,1};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) { //we are adding -i because the last no. is gratest so we dont have to check it again
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}

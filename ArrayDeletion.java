import java.util.Arrays;

public class ArrayDeletion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int index = 3;
        for(int j=index;j<arr.length-1;j++){
            arr[j]=arr[j+1];
        }
        System.out.println(Arrays.toString(arr));
    }
}

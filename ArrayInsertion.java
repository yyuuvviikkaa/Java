import java.util.*;
public class ArrayInsertion {
    public static void main(String[] args) {
        int[] arr = {6, 0, 3, 4, 5 ,0, 0};
        int index=3;
        int value=9;
        for(int i=arr.length-1;i>=index;i--){
            if(arr[i]!=0){
                arr[i+1]=arr[i];
            }
             else if(i==index){
                break;
            }
        }
        arr[index]=value;
        System.out.println(Arrays.toString(arr));
    }
}

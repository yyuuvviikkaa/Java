import java.util.*;
public class ArrayBinarySearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int target=6;
        int index=-1;
        int s=0;
        int e=arr.length-1;
        int m;
        while(s<=e){
            m=(e+s)/2;
            if(arr[m]==target){
                index=m;
                break;
            }
            else if(arr[m]>target){
            e=m-1;
            }
            else{
                s=m+1;
            }
        }
        System.out.println("Target present at :" +index);

    }
}
